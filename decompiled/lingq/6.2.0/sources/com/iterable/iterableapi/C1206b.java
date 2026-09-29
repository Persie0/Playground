package com.iterable.iterableapi;

import android.util.Base64;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Timer;
import java.util.concurrent.Executors;
import org.json.JSONObject;
import p000.C3386nv;
import p000.ab4;
import p000.bb4;
import p000.eh0;
import p000.fb4;
import p000.hb4;
import p000.pc4;
import p000.s01;

/* JADX INFO: renamed from: com.iterable.iterableapi.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1206b implements ab4 {

    /* JADX INFO: renamed from: a */
    public final fb4 f13988a;

    /* JADX INFO: renamed from: b */
    public final long f13989b;

    /* JADX INFO: renamed from: c */
    public Timer f13990c;

    /* JADX INFO: renamed from: d */
    public final s01 f13991d;

    /* JADX INFO: renamed from: e */
    public volatile boolean f13992e;

    /* JADX INFO: renamed from: f */
    public volatile IterableAuthManager$AuthState f13993f = IterableAuthManager$AuthState.UNKNOWN;

    /* JADX INFO: renamed from: g */
    public final ArrayList f13994g = new ArrayList();

    public C1206b(fb4 fb4Var, s01 s01Var) {
        Executors.newSingleThreadExecutor();
        this.f13988a = fb4Var;
        this.f13991d = s01Var;
        this.f13989b = 60000L;
        bb4.f8269i.m3555a(this);
    }

    @Override // p000.ab4
    /* JADX INFO: renamed from: a */
    public final void mo231a() {
        try {
            eh0.m11133m("IterableAuth", "App switched to background - disabling auth token requests");
            Timer timer = this.f13990c;
            if (timer != null) {
                timer.cancel();
                this.f13990c = null;
                this.f13992e = false;
            }
        } catch (Exception e) {
            eh0.m11136q("IterableAuth", "Error while switching to background", e);
        }
    }

    @Override // p000.ab4
    /* JADX INFO: renamed from: b */
    public final void mo232b() {
        try {
            eh0.m11133m("IterableAuth", "App switched to foreground - enabling auth token requests");
            fb4 fb4Var = this.f13988a;
            if (fb4Var.f38773d == null && fb4Var.f38774e == null) {
                eh0.m11133m("IterableAuth", "Email or userId is not available. Skipping token refresh");
                return;
            }
            m6897d(fb4Var.f38776g);
        } catch (Exception e) {
            eh0.m11136q("IterableAuth", "Error occurred in handling auth token refresh", e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final long m6896c() {
        s01 s01Var = this.f13991d;
        long j = s01Var.f60110b;
        if (((RetryPolicy$Type) s01Var.f60111c) != RetryPolicy$Type.EXPONENTIAL) {
            return j;
        }
        return (long) (Math.pow(2.0d, -1.0d) * j);
    }

    /* JADX INFO: renamed from: d */
    public final void m6897d(String str) {
        long j;
        Timer timer = this.f13990c;
        if (timer != null) {
            timer.cancel();
            this.f13990c = null;
            this.f13992e = false;
        }
        try {
            if (str == null) {
                eh0.m11133m("IterableAuth", "JWT is null. Scheduling token refresh");
                if (this.f13992e) {
                    return;
                }
                m6898e(m6896c(), false, null);
                return;
            }
            String[] strArrSplit = str.split("\\.");
            if (strArrSplit.length == 3) {
                j = new JSONObject(new String(Base64.decode(strArrSplit[1], 8), "UTF-8")).getLong("exp");
            } else {
                C3386nv.m17626m("Invalid JWT");
                j = 0;
            }
            long jCurrentTimeMillis = ((j * 1000) - this.f13989b) - System.currentTimeMillis();
            if (jCurrentTimeMillis > 0) {
                m6898e(jCurrentTimeMillis, true, null);
            } else {
                m6898e(m6896c(), true, null);
            }
        } catch (Exception e) {
            eh0.m11136q("IterableAuth", "Error while parsing JWT for the expiration", e);
            AuthFailureReason authFailureReason = AuthFailureReason.AUTH_TOKEN_EXPIRED;
            m6898e(m6896c(), false, null);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m6898e(long j, boolean z, pc4 pc4Var) {
        if (this.f13992e) {
            return;
        }
        if (this.f13990c == null) {
            this.f13990c = new Timer(true);
        }
        try {
            this.f13990c.schedule(new hb4(this, pc4Var, z), j);
            this.f13992e = true;
        } catch (Exception e) {
            eh0.m11136q("IterableAuth", "timer exception: " + this.f13990c, e);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m6899f(IterableAuthManager$AuthState iterableAuthManager$AuthState) {
        IterableAuthManager$AuthState iterableAuthManager$AuthState2 = this.f13993f;
        this.f13993f = iterableAuthManager$AuthState;
        IterableAuthManager$AuthState iterableAuthManager$AuthState3 = IterableAuthManager$AuthState.INVALID;
        if (iterableAuthManager$AuthState2 != iterableAuthManager$AuthState3 || iterableAuthManager$AuthState == iterableAuthManager$AuthState3) {
            return;
        }
        Iterator it = new ArrayList(this.f13994g).iterator();
        while (it.hasNext()) {
            ((C1220p) it.next()).m6957d();
        }
    }
}
