package p000;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.C0101i;
import androidx.compose.runtime.AbstractC0278f;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class yn8 implements do8 {

    /* JADX INFO: renamed from: j */
    public static final fs6 f70116j = new fs6(19, new am8(23), new zl8(27));

    /* JADX INFO: renamed from: a */
    public final sc9 f70117a;

    /* JADX INFO: renamed from: f */
    public float f70122f;

    /* JADX INFO: renamed from: h */
    public final gc2 f70124h;

    /* JADX INFO: renamed from: i */
    public final gc2 f70125i;

    /* JADX INFO: renamed from: b */
    public final sc9 f70118b = AbstractC0278f.m1257g(0);

    /* JADX INFO: renamed from: c */
    public final sc9 f70119c = AbstractC0278f.m1257g(0);

    /* JADX INFO: renamed from: d */
    public final v56 f70120d = new v56();

    /* JADX INFO: renamed from: e */
    public final sc9 f70121e = AbstractC0278f.m1257g(Integer.MAX_VALUE);

    /* JADX INFO: renamed from: g */
    public final C0101i f70123g = new C0101i(new kv4(this, 21));

    public yn8(int i) {
        this.f70117a = AbstractC0278f.m1257g(i);
        final int i2 = 0;
        this.f70124h = AbstractC0278f.m1254d(new ui3(this) { // from class: xn8

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ yn8 f68404b;

            {
                this.f68404b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                int i3 = i2;
                yn8 yn8Var = this.f68404b;
                switch (i3) {
                    case 0:
                        return Boolean.valueOf(yn8Var.f70117a.m21222h() < yn8Var.f70121e.m21222h());
                    default:
                        return Boolean.valueOf(yn8Var.f70117a.m21222h() > 0);
                }
            }
        });
        final int i3 = 1;
        this.f70125i = AbstractC0278f.m1254d(new ui3(this) { // from class: xn8

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ yn8 f68404b;

            {
                this.f68404b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                int i4 = i3;
                yn8 yn8Var = this.f68404b;
                switch (i4) {
                    case 0:
                        return Boolean.valueOf(yn8Var.f70117a.m21222h() < yn8Var.f70121e.m21222h());
                    default:
                        return Boolean.valueOf(yn8Var.f70117a.m21222h() > 0);
                }
            }
        });
    }

    @Override // p000.do8
    /* JADX INFO: renamed from: a */
    public final boolean mo863a() {
        return this.f70123g.mo863a();
    }

    @Override // p000.do8
    /* JADX INFO: renamed from: b */
    public final boolean mo974b() {
        return ((Boolean) this.f70125i.getValue()).booleanValue();
    }

    @Override // p000.do8
    /* JADX INFO: renamed from: c */
    public final Object mo864c(MutatePriority mutatePriority, zi3 zi3Var, ContinuationImpl continuationImpl) {
        Object objMo864c = this.f70123g.mo864c(mutatePriority, zi3Var, continuationImpl);
        return objMo864c == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo864c : xfa.f68157a;
    }

    @Override // p000.do8
    /* JADX INFO: renamed from: d */
    public final boolean mo975d() {
        return ((Boolean) this.f70124h.getValue()).booleanValue();
    }

    @Override // p000.do8
    /* JADX INFO: renamed from: e */
    public final float mo865e(float f) {
        return this.f70123g.mo865e(f);
    }
}
