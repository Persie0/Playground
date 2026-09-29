package p000;

import androidx.compose.runtime.AbstractC0279g;

/* JADX INFO: loaded from: classes.dex */
public final class zf1 extends AbstractC0279g {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f71482b = 1;

    /* JADX INFO: renamed from: c */
    public final Object f71483c;

    public zf1(vi3 vi3Var) {
        super(new wf1(1));
        this.f71483c = new ag1(vi3Var);
    }

    @Override // androidx.compose.runtime.AbstractC0279g
    /* JADX INFO: renamed from: a */
    public final a02 mo1265a(Object obj) {
        switch (this.f71482b) {
            case 0:
                return new a02(this, obj, obj == null, null, true);
            default:
                return new a02(this, obj, obj == null, (yc9) this.f71483c, true);
        }
    }

    @Override // androidx.compose.runtime.AbstractC0279g
    /* JADX INFO: renamed from: b */
    public aoa mo1266b() {
        switch (this.f71482b) {
            case 0:
                return (ag1) this.f71483c;
            default:
                return super.mo1266b();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf1(ui3 ui3Var) {
        super(ui3Var);
        tr3 tr3Var = tr3.f62761g;
        this.f71483c = tr3Var;
    }
}
