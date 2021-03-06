package com.lensim.fingerchat.data.work_center;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.lensim.fingerchat.data.repository.SPDataRepository;


/**
 * date on 2018/1/5
 * author ll147996
 * describe
 */

public class OATokenRepository {

    private OAToken oaToken;
    private SPDataRepository<OAToken> spDataRepository;


    private OATokenRepository() {
        spDataRepository = new SPDataRepository<>();
    }

    public static OATokenRepository getInstance() {
        return Singleton.INSTANCE;
    }

    private static class Singleton {

        private static final OATokenRepository INSTANCE = new OATokenRepository();
    }


    public OAToken getOAToken() {
        if (oaToken != null) {
            return oaToken;
        } else {
            return spDataRepository.getData(OAToken.class);
        }
    }

    public void setOAToken(@NonNull OAToken userInfo) {
        this.oaToken = userInfo;
        spDataRepository.saveData(userInfo);
    }

    public String getUserId() {
        if (getInstance().getOAToken() != null) {
            return getInstance().getOAToken().getUserId();
        }
        return "";
    }

    public static String getToken() {
        if (getInstance().getOAToken() != null) {
            return getInstance().getOAToken().getOaToken();
        }
        return "";
    }

    public static long getTokenValidTime(String userId) {
        if (getInstance().getOAToken() != null && !TextUtils.isEmpty(userId) && userId
            .equalsIgnoreCase(getInstance().getUserId())) {
            return getInstance().getOAToken().getTokenValidTime();
        } else {
            return 0;
        }
    }

    public void clearOAToken() {
        if (getInstance().getOAToken() != null && spDataRepository != null) {
            spDataRepository.removeData(OAToken.class);
        }
    }
}
