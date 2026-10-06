package p000;

import android.os.Bundle;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import p021j$.util.Collection$EL;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class fba {

    /* JADX INFO: renamed from: a */
    private static final Bundle f21186a = new Bundle();

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ int f21187l = 0;

    /* JADX INFO: renamed from: h */
    public faz f21191h;

    /* JADX INFO: renamed from: i */
    public faz f21192i;

    /* JADX INFO: renamed from: j */
    public faz f21193j;

    /* JADX INFO: renamed from: k */
    public faz f21194k;

    /* JADX INFO: renamed from: f */
    final List f21189f = new ArrayList();

    /* JADX INFO: renamed from: g */
    final List f21190g = new ArrayList();

    /* JADX INFO: renamed from: b */
    private final HashSet f21188b = new HashSet();

    /* JADX INFO: renamed from: f */
    public static final String m8091f(fbp fbpVar) {
        if (fbpVar instanceof fbm) {
            return fbpVar instanceof fbq ? ((fbq) fbpVar).m8105a() : fbpVar.getClass().getName();
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static final Bundle m8092g(fbp fbpVar, Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String strM8091f = m8091f(fbpVar);
        return strM8091f != null ? bundle.getBundle(strM8091f) : f21186a;
    }

    /* JADX INFO: renamed from: a */
    final Object m8093a(BiFunction biFunction, Object obj) {
        for (int i = 0; i < this.f21189f.size(); i++) {
            obj = biFunction.apply((fbp) this.f21189f.get(i), obj);
        }
        return obj;
    }

    /* JADX INFO: renamed from: b */
    final void m8094b(Consumer consumer) {
        for (int i = 0; i < this.f21189f.size(); i++) {
            consumer.accept((fbp) this.f21189f.get(i));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m8095c(faz fazVar) {
        this.f21190g.remove(fazVar);
    }

    /* JADX INFO: renamed from: d */
    public final void m8096d(faz fazVar) {
        fazVar.getClass();
        m8094b(new dco(fazVar, 18));
        this.f21190g.add(fazVar);
    }

    /* JADX INFO: renamed from: e */
    public final void m8097e(fbp fbpVar) {
        lku.m15614I(Looper.getMainLooper().isCurrentThread(), "addObserver must be called on the main thread.");
        String strM8091f = m8091f(fbpVar);
        if (strM8091f != null) {
            if (this.f21188b.contains(strM8091f)) {
                throw new IllegalStateException(String.format("Duplicate observer tag: '%s'. Implement LifecycleObserverTag to provide unique tags.", strM8091f));
            }
            this.f21188b.add(strM8091f);
        }
        this.f21189f.add(fbpVar);
        Collection$EL.forEach(this.f21190g, new dco(fbpVar, 17));
    }
}
