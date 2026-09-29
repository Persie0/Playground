package p000;

import androidx.compose.p002ui.node.C0357g;
import androidx.compose.p002ui.semantics.C0423c;
import com.amplitude.core.utilities.C0913a;
import java.io.File;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class nu2 implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f53255a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f53256b;

    public nu2(Comparator comparator) {
        this.f53255a = 1;
        this.f53256b = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String strM23396s0;
        String strM23396s1;
        int i = this.f53255a;
        Object obj3 = this.f53256b;
        switch (i) {
            case 0:
                File file = (File) obj;
                file.getClass();
                String strM23079U = v33.m23079U(file);
                StringBuilder sb = new StringBuilder();
                C0913a c0913a = (C0913a) obj3;
                sb.append(c0913a.f11252b);
                sb.append('-');
                String strM4839V = cl9.m4839V(strM23079U, sb.toString(), "");
                int iM23388k0 = vk9.m23388k0(strM4839V, '-', 0, 6);
                if (iM23388k0 >= 0) {
                    strM23396s0 = vk9.m23396s0(10, strM4839V.substring(0, iM23388k0)) + strM4839V.substring(iM23388k0);
                } else {
                    strM23396s0 = vk9.m23396s0(10, strM4839V);
                }
                File file2 = (File) obj2;
                file2.getClass();
                String strM4839V2 = cl9.m4839V(v33.m23079U(file2), c0913a.f11252b + '-', "");
                int iM23388k1 = vk9.m23388k0(strM4839V2, '-', 0, 6);
                if (iM23388k1 >= 0) {
                    strM23396s1 = vk9.m23396s0(10, strM4839V2.substring(0, iM23388k1)) + strM4839V2.substring(iM23388k1);
                } else {
                    strM23396s1 = vk9.m23396s0(10, strM4839V2);
                }
                return ss5.m21718o(strM23396s0, strM23396s1);
            case 1:
                int iCompare = ((Comparator) obj3).compare(obj, obj2);
                if (iCompare != 0) {
                    return iCompare;
                }
                return C0357g.f4314o0.compare(((C0423c) obj).f4973c, ((C0423c) obj2).f4973c);
            default:
                int iCompare2 = ((nu2) obj3).compare(obj, obj2);
                return iCompare2 != 0 ? iCompare2 : ss5.m21718o(Integer.valueOf(((C0423c) obj).f4976f), Integer.valueOf(((C0423c) obj2).f4976f));
        }
    }

    public /* synthetic */ nu2(Object obj, int i) {
        this.f53255a = i;
        this.f53256b = obj;
    }
}
