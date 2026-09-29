package androidx.compose.p017ui.platform;

import androidx.compose.p017ui.semantics.SemanticsNode;
import java.util.Comparator;
import p260m8.C7499b;

/* JADX INFO: renamed from: androidx.compose.ui.platform.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0663t<T> implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Comparator f4343a;

    public C0663t(C0660s c0660s) {
        this.f4343a = c0660s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t10, T t11) {
        int iCompare = this.f4343a.compare(t10, t11);
        return iCompare != 0 ? iCompare : C7499b.m14951m(Integer.valueOf(((SemanticsNode) t10).f4402g), Integer.valueOf(((SemanticsNode) t11).f4402g));
    }
}
