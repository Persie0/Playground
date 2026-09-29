package p000;

import android.os.Bundle;
import com.lingq.feature.library.preview.LessonPreviewFragment;
import com.lingq.p020ui.HomeFragment;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class c82 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9700a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f9701b;

    public /* synthetic */ c82(Object obj, int i) {
        this.f9700a = i;
        this.f9701b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [h66] */
    /* JADX WARN: Type inference failed for: r5v1, types: [ei4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v3, types: [h66] */
    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        l7a state;
        int i = this.f9700a;
        Object obj = this.f9701b;
        switch (i) {
            case 0:
                o89 o89Var = (o89) obj;
                k7a k7aVar = o89Var.f54014l;
                float fM15981d = (k7aVar == null || (state = k7aVar.getState()) == null) ? 0.0f : state.m15981d();
                g7a g7aVar = o89Var.f54013k;
                return new aa1(d32.m10026X(g7aVar.f40360a, g7aVar.f40361b, io2.f44351c.mo12780a(fM15981d > 0.01f ? 1.0f : 0.0f)));
            case 1:
                ArrayList arrayList = ((wj3) obj).f66926a;
                n66 n66Var = new n66(arrayList.size());
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ?? r5 = (ei4) arrayList.get(i2);
                    Object obj2 = r5.f37282b;
                    int i3 = r5.f37281a;
                    Object af4Var = obj2 != null ? new af4(Integer.valueOf(i3), r5.f37282b) : Integer.valueOf(i3);
                    int iM17254f = n66Var.m17254f(af4Var);
                    boolean z = iM17254f < 0;
                    Object obj3 = z ? null : n66Var.f52401c[iM17254f];
                    if (obj3 != null) {
                        if (obj3 instanceof h66) {
                            ?? r9 = (h66) obj3;
                            r9.m13090g(r5);
                            r5 = r9;
                        } else {
                            Object[] objArr = ip6.f44399a;
                            ?? h66Var = new h66(2);
                            h66Var.m13090g(obj3);
                            h66Var.m13090g(r5);
                            r5 = h66Var;
                        }
                    }
                    if (z) {
                        int i4 = ~iM17254f;
                        n66Var.f52400b[i4] = af4Var;
                        n66Var.f52401c[i4] = r5;
                    } else {
                        n66Var.f52401c[iM17254f] = r5;
                    }
                }
                return new g56(n66Var);
            case 2:
                HomeFragment homeFragment = (HomeFragment) obj;
                Bundle bundle = homeFragment.f5695f;
                if (bundle != null) {
                    return bundle;
                }
                v63.m23148z("Fragment ", homeFragment, " has null arguments");
                return null;
            case 3:
                LessonPreviewFragment lessonPreviewFragment = (LessonPreviewFragment) obj;
                Bundle bundle2 = lessonPreviewFragment.f5695f;
                if (bundle2 != null) {
                    return bundle2;
                }
                v63.m23148z("Fragment ", lessonPreviewFragment, " has null arguments");
                return null;
            default:
                ((b85) obj).mo3449b();
                return xfa.f68157a;
        }
    }
}
