package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import androidx.fragment.app.ActivityC0979t;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.C2548c;
import com.google.android.gms.common.api.C2542a.c;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p152hb.C5949a;
import p152hb.C5961d;
import p152hb.C5965e;
import p152hb.C6001q;
import p152hb.C6020w0;
import p152hb.InterfaceC5968f;
import p176ib.C6254b;
import p326q.C8448d;
import p338qd.C8573r0;
import p412ub.HandlerC9517f;

/* JADX INFO: renamed from: com.google.android.gms.common.api.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2543b<O extends C2542a.c> {

    /* JADX INFO: renamed from: a */
    public final Context f13887a;

    /* JADX INFO: renamed from: b */
    public final String f13888b;

    /* JADX INFO: renamed from: c */
    public final C2542a<O> f13889c;

    /* JADX INFO: renamed from: d */
    public final O f13890d;

    /* JADX INFO: renamed from: e */
    public final C5949a<O> f13891e;

    /* JADX INFO: renamed from: f */
    public final Looper f13892f;

    /* JADX INFO: renamed from: g */
    public final int f13893g;

    /* JADX INFO: renamed from: h */
    @NotOnlyInitialized
    public final C6020w0 f13894h;

    /* JADX INFO: renamed from: i */
    public final C8573r0 f13895i;

    /* JADX INFO: renamed from: j */
    public final C5961d f13896j;

    /* JADX INFO: renamed from: com.google.android.gms.common.api.b$a */
    public static class a {

        /* JADX INFO: renamed from: c */
        public static final a f13897c = new a(new C8573r0(), Looper.getMainLooper());

        /* JADX INFO: renamed from: a */
        public final C8573r0 f13898a;

        /* JADX INFO: renamed from: b */
        public final Looper f13899b;

        public a(C8573r0 c8573r0, Looper looper) {
            this.f13898a = c8573r0;
            this.f13899b = looper;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public AbstractC2543b() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    public AbstractC2543b(Context context, ActivityC0979t activityC0979t, C2542a c2542a, C2542a.c cVar, a aVar) {
        String str;
        if (context == null) {
            throw new NullPointerException("Null context is not permitted.");
        }
        if (c2542a == null) {
            throw new NullPointerException("Api must not be null.");
        }
        if (aVar == null) {
            throw new NullPointerException("Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        }
        this.f13887a = context.getApplicationContext();
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                str = null;
            }
        } else {
            str = null;
        }
        this.f13888b = str;
        this.f13889c = c2542a;
        this.f13890d = cVar;
        this.f13892f = aVar.f13899b;
        C5949a<O> c5949a = new C5949a<>(c2542a, cVar, str);
        this.f13891e = c5949a;
        this.f13894h = new C6020w0(this);
        C5961d c5961dM12400f = C5961d.m12400f(this.f13887a);
        this.f13896j = c5961dM12400f;
        this.f13893g = c5961dM12400f.f35449h.getAndIncrement();
        this.f13895i = aVar.f13898a;
        if (activityC0979t != null && !(activityC0979t instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            InterfaceC5968f interfaceC5968fM7571c = LifecycleCallback.m7571c(new C5965e(activityC0979t));
            C6001q c6001q = (C6001q) interfaceC5968fM7571c.mo12395c(C6001q.class, "ConnectionlessLifecycleHelper");
            if (c6001q == null) {
                Object obj = C2548c.f13919c;
                c6001q = new C6001q(interfaceC5968fM7571c, c5961dM12400f);
            }
            c6001q.f35575f.add(c5949a);
            c5961dM12400f.m12401a(c6001q);
        }
        HandlerC9517f handlerC9517f = c5961dM12400f.f35440I;
        handlerC9517f.sendMessage(handlerC9517f.obtainMessage(7, this));
    }

    public AbstractC2543b(Context context, C2542a<O> c2542a, O o10, a aVar) {
        this(context, null, c2542a, o10, aVar);
    }

    /* JADX INFO: renamed from: a */
    public final C6254b.a m7554a() {
        Account accountM7535l;
        GoogleSignInAccount googleSignInAccountM7536a;
        GoogleSignInAccount googleSignInAccountM7536a2;
        C6254b.a aVar = new C6254b.a();
        O o10 = this.f13890d;
        boolean z10 = o10 instanceof C2542a.c.b;
        if (!z10 || (googleSignInAccountM7536a2 = ((C2542a.c.b) o10).m7536a()) == null) {
            accountM7535l = o10 instanceof C2542a.c.a ? ((C2542a.c.a) o10).m7535l() : null;
        } else {
            String str = googleSignInAccountM7536a2.f13803d;
            if (str != null) {
                accountM7535l = new Account(str, "com.google");
            }
        }
        aVar.f36447a = accountM7535l;
        Set setEmptySet = (!z10 || (googleSignInAccountM7536a = ((C2542a.c.b) o10).m7536a()) == null) ? Collections.emptySet() : googleSignInAccountM7536a.m7521q();
        if (aVar.f36448b == null) {
            aVar.f36448b = new C8448d<>();
        }
        aVar.f36448b.addAll(setEmptySet);
        Context context = this.f13887a;
        aVar.f36450d = context.getClass().getName();
        aVar.f36449c = context.getPackageName();
        return aVar;
    }
}
