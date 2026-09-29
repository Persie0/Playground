package p000;

import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: a3 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC0005a3 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2913d3 f147a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AccessToken f148b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AtomicBoolean f149c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ HashSet f150d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ HashSet f151e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ HashSet f152f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ w41 f153g;

    public /* synthetic */ RunnableC0005a3(C2913d3 c2913d3, AccessToken accessToken, AtomicBoolean atomicBoolean, HashSet hashSet, HashSet hashSet2, HashSet hashSet3, w41 w41Var) {
        this.f147a = c2913d3;
        this.f148b = accessToken;
        this.f149c = atomicBoolean;
        this.f150d = hashSet;
        this.f151e = hashSet2;
        this.f152f = hashSet3;
        this.f153g = w41Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        Date date;
        AccessToken accessToken = this.f148b;
        AtomicBoolean atomicBoolean = this.f149c;
        AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.f153g.f66368d;
        C2913d3 c2913d3 = this.f147a;
        String str = (String) c2913d3.f34884c;
        int i = c2913d3.f34882a;
        Long l = (Long) c2913d3.f34886e;
        String str2 = (String) c2913d3.f34885d;
        try {
            tr3 tr3Var = w41.f66361h;
            if (((AccessToken) tr3Var.m22270m().f66367c) != null) {
                AccessToken accessToken2 = (AccessToken) tr3Var.m22270m().f66367c;
                if ((accessToken2 != null ? accessToken2.f11315i : null) == accessToken.f11315i) {
                    if (!atomicBoolean.get() && str == null && i == 0) {
                        return;
                    }
                    Date date2 = accessToken.f11307a;
                    if (c2913d3.f34882a != 0) {
                        date = new Date(((long) c2913d3.f34882a) * 1000);
                        j = 1000;
                    } else {
                        if (c2913d3.f34883b != 0) {
                            j = 1000;
                            date2 = new Date((((long) c2913d3.f34883b) * 1000) + new Date().getTime());
                        } else {
                            j = 1000;
                        }
                        date = date2;
                    }
                    if (str == null) {
                        str = accessToken.f11311e;
                    }
                    String str3 = str;
                    String str4 = accessToken.f11314h;
                    String str5 = accessToken.f11315i;
                    Collection collection = atomicBoolean.get() ? this.f150d : accessToken.f11308b;
                    Collection collection2 = atomicBoolean.get() ? this.f151e : accessToken.f11309c;
                    Collection collection3 = atomicBoolean.get() ? this.f152f : accessToken.f11310d;
                    AccessTokenSource accessTokenSource = accessToken.f11312f;
                    Date date3 = new Date();
                    Date date4 = l != null ? new Date(l.longValue() * j) : accessToken.f11316j;
                    if (str2 == null) {
                        str2 = accessToken.f11317k;
                    }
                    tr3Var.m22270m().m23714H(new AccessToken(str3, str4, str5, collection, collection2, collection3, accessTokenSource, date, date3, date4, str2), true);
                }
            }
        } finally {
            atomicBoolean2.set(false);
        }
    }
}
