package p000;

import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import androidx.fragment.app.SpecialEffectsController$Operation$State;

/* JADX INFO: loaded from: classes.dex */
public final class o82 extends AbstractC3572sf {

    /* JADX INFO: renamed from: b */
    public final Object f53968b;

    /* JADX INFO: renamed from: c */
    public final boolean f53969c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:13:0x001f A[PHI: r5
      0x001f: PHI (r5v1 java.lang.Object) = (r5v0 java.lang.Object), (r5v2 java.lang.Object) binds: [B:23:0x0032, B:9:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    public o82(ze9 ze9Var, boolean z, boolean z2) {
        Object obj;
        super(ze9Var);
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = ze9Var.f71466c;
        SpecialEffectsController$Operation$State specialEffectsController$Operation$State = ze9Var.f71464a;
        SpecialEffectsController$Operation$State specialEffectsController$Operation$State2 = SpecialEffectsController$Operation$State.VISIBLE;
        Object obj2 = AbstractComponentCallbacksC0635c.f5665v0;
        Object obj3 = null;
        if (specialEffectsController$Operation$State == specialEffectsController$Operation$State2) {
            if (z) {
                ed3 ed3Var = abstractComponentCallbacksC0635c.f5698g0;
                if (ed3Var != null) {
                    obj = ed3Var.f37050j;
                    if (obj != obj2) {
                        obj3 = obj;
                    } else if (ed3Var != null) {
                        obj3 = ed3Var.f37049i;
                    }
                }
            } else {
                ed3 ed3Var2 = abstractComponentCallbacksC0635c.f5698g0;
                if (ed3Var2 != null) {
                    obj3 = ed3Var2.f37047g;
                }
            }
        } else if (z) {
            ed3 ed3Var3 = abstractComponentCallbacksC0635c.f5698g0;
            if (ed3Var3 != null) {
                obj = ed3Var3.f37048h;
                if (obj != obj2) {
                    obj3 = obj;
                } else if (ed3Var3 != null) {
                    obj3 = ed3Var3.f37047g;
                }
            }
        } else {
            ed3 ed3Var4 = abstractComponentCallbacksC0635c.f5698g0;
            if (ed3Var4 != null) {
                obj3 = ed3Var4.f37049i;
            }
        }
        this.f53968b = obj3;
        if (specialEffectsController$Operation$State == specialEffectsController$Operation$State2) {
            if (z) {
                ed3 ed3Var5 = abstractComponentCallbacksC0635c.f5698g0;
            } else {
                ed3 ed3Var6 = abstractComponentCallbacksC0635c.f5698g0;
            }
        }
        this.f53969c = true;
        if (z2) {
            if (z) {
                ed3 ed3Var7 = abstractComponentCallbacksC0635c.f5698g0;
            } else {
                abstractComponentCallbacksC0635c.getClass();
            }
        }
    }
}
