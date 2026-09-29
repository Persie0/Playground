package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.auth.api.identity.AuthorizationResult;
import com.google.android.gms.auth.api.identity.C0944a;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class eeb extends no3 {

    /* JADX INFO: renamed from: m */
    public static final b64 f37136m = new b64("Auth.Api.Identity.Authorization.API", new ydb(1), new p84(7));

    /* JADX INFO: renamed from: l */
    public final String f37137l;

    public eeb(Context context, deb debVar) {
        super(context, f37136m, debVar, mo3.f51630c);
        this.f37137l = ieb.m13815a();
    }

    /* JADX INFO: renamed from: d */
    public final tld m11081d(AuthorizationRequest authorizationRequest) {
        C0944a c0944aM5267r = AuthorizationRequest.m5267r(authorizationRequest);
        c0944aM5267r.f11575g = this.f37137l;
        AuthorizationRequest authorizationRequest2 = new AuthorizationRequest(c0944aM5267r.f11569a, c0944aM5267r.f11570b, c0944aM5267r.f11571c, c0944aM5267r.f11572d, c0944aM5267r.f11573e, c0944aM5267r.f11574f, c0944aM5267r.f11575g, c0944aM5267r.f11576h, c0944aM5267r.f11577i, c0944aM5267r.f11578j, c0944aM5267r.f11579k);
        i44 i44VarM13651b = i44.m13651b();
        i44VarM13651b.f43483d = new Feature[]{iyc.f44789b};
        i44VarM13651b.f43482c = new cdb(this, authorizationRequest2, false, 4);
        i44VarM13651b.f43480a = false;
        i44VarM13651b.f43481b = 1534;
        return m17569c(0, i44VarM13651b.m13652a());
    }

    /* JADX INFO: renamed from: e */
    public final AuthorizationResult m11082e(Intent intent) throws ApiException {
        Status status = Status.f11659g;
        if (intent == null) {
            throw new ApiException(status);
        }
        Status status2 = (Status) qyc.m20219a(intent, "status", Status.CREATOR);
        if (status2 == null) {
            throw new ApiException(Status.f11661i);
        }
        if (!status2.m5282r()) {
            throw new ApiException(status2);
        }
        AuthorizationResult authorizationResult = (AuthorizationResult) qyc.m20219a(intent, "authorization_result", AuthorizationResult.CREATOR);
        if (authorizationResult != null) {
            return authorizationResult;
        }
        throw new ApiException(status);
    }
}
