package p000;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.AbstractC0278f;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class lv9 implements do8 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ do8 f50196a;

    /* JADX INFO: renamed from: b */
    public final gc2 f50197b;

    /* JADX INFO: renamed from: c */
    public final gc2 f50198c;

    public lv9(do8 do8Var, final mv9 mv9Var) {
        this.f50196a = do8Var;
        final int i = 0;
        this.f50197b = AbstractC0278f.m1254d(new ui3() { // from class: kv9
            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                int i2 = i;
                mv9 mv9Var2 = mv9Var;
                switch (i2) {
                    case 0:
                        return Boolean.valueOf(mv9Var2.f51891a.m19861h() < mv9Var2.f51892b.m19861h());
                    default:
                        return Boolean.valueOf(mv9Var2.f51891a.m19861h() > 0.0f);
                }
            }
        });
        final int i2 = 1;
        this.f50198c = AbstractC0278f.m1254d(new ui3() { // from class: kv9
            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                int i3 = i2;
                mv9 mv9Var2 = mv9Var;
                switch (i3) {
                    case 0:
                        return Boolean.valueOf(mv9Var2.f51891a.m19861h() < mv9Var2.f51892b.m19861h());
                    default:
                        return Boolean.valueOf(mv9Var2.f51891a.m19861h() > 0.0f);
                }
            }
        });
    }

    @Override // p000.do8
    /* JADX INFO: renamed from: a */
    public final boolean mo863a() {
        return this.f50196a.mo863a();
    }

    @Override // p000.do8
    /* JADX INFO: renamed from: b */
    public final boolean mo974b() {
        return ((Boolean) this.f50198c.getValue()).booleanValue();
    }

    @Override // p000.do8
    /* JADX INFO: renamed from: c */
    public final Object mo864c(MutatePriority mutatePriority, zi3 zi3Var, ContinuationImpl continuationImpl) {
        return this.f50196a.mo864c(mutatePriority, zi3Var, continuationImpl);
    }

    @Override // p000.do8
    /* JADX INFO: renamed from: d */
    public final boolean mo975d() {
        return ((Boolean) this.f50197b.getValue()).booleanValue();
    }

    @Override // p000.do8
    /* JADX INFO: renamed from: e */
    public final float mo865e(float f) {
        return this.f50196a.mo865e(f);
    }
}
