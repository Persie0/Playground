package p000;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Map;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: renamed from: hm */
/* JADX INFO: loaded from: classes.dex */
public final class C3080hm implements zh2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42594a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f42595b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f42596c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f42597d;

    public /* synthetic */ C3080hm(Object obj, Object obj2, Object obj3, int i) {
        this.f42594a = i;
        this.f42595b = obj;
        this.f42596c = obj2;
        this.f42597d = obj3;
    }

    @Override // p000.zh2
    /* JADX INFO: renamed from: a */
    public final void mo1799a() {
        int i = this.f42594a;
        Object obj = this.f42597d;
        Object obj2 = this.f42596c;
        Object obj3 = this.f42595b;
        switch (i) {
            case 0:
                ((SnapshotStateList) obj3).remove(obj2);
                ((C3189km) obj).f47507d.m17259k(obj2);
                break;
            case 1:
                ((ub5) obj3).mo256K().mo21331x((ob5) obj2);
                bc5 bc5Var = (bc5) ((Ref$ObjectRef) obj).f47718a;
                if (bc5Var != null) {
                    bc5Var.mo3608a();
                }
                break;
            default:
                gl8 gl8Var = (gl8) obj3;
                ll8 ll8Var = (ll8) obj;
                if (gl8Var.f40975b.m17259k(obj2) == ll8Var) {
                    Map map = gl8Var.f40974a;
                    Map mapMo10401d = ll8Var.mo10401d();
                    if (!mapMo10401d.isEmpty()) {
                        map.put(obj2, mapMo10401d);
                    } else {
                        map.remove(obj2);
                    }
                }
                break;
        }
    }
}
