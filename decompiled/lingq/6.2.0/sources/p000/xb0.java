package p000;

import androidx.work.impl.constraints.controllers.AbstractC0777a;

/* JADX INFO: loaded from: classes.dex */
public final class xb0 extends AbstractC0777a {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f68017b;

    /* JADX INFO: renamed from: c */
    public final int f68018c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb0(yb0 yb0Var, int i) {
        super(yb0Var);
        this.f68017b = i;
        yb0Var.getClass();
        switch (i) {
            case 2:
                super(yb0Var);
                this.f68018c = 9;
                break;
            default:
                this.f68018c = 6;
                break;
        }
    }

    @Override // p000.dj1
    /* JADX INFO: renamed from: b */
    public final boolean mo2921b(p8b p8bVar) {
        switch (this.f68017b) {
            case 0:
                return p8bVar.f55781j.m521i();
            case 1:
                return p8bVar.f55781j.m520h();
            default:
                return p8bVar.f55781j.m523k();
        }
    }

    @Override // androidx.work.impl.constraints.controllers.AbstractC0777a
    /* JADX INFO: renamed from: c */
    public final int mo2923c() {
        switch (this.f68017b) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f68018c;
    }

    @Override // androidx.work.impl.constraints.controllers.AbstractC0777a
    /* JADX INFO: renamed from: d */
    public final boolean mo2924d(Object obj) {
        boolean zBooleanValue;
        switch (this.f68017b) {
            case 0:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 1:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            default:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
        }
        return !zBooleanValue;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb0(yb0 yb0Var) {
        super(yb0Var);
        this.f68017b = 1;
        yb0Var.getClass();
        this.f68018c = 5;
    }
}
