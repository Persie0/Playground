package androidx.compose.p017ui.platform;

import androidx.compose.p017ui.semantics.SemanticsNode;
import java.util.Comparator;
import p166i1.C6161p;
import p504y9.C10317j;

/* JADX INFO: renamed from: androidx.compose.ui.platform.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0660s<T> implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Comparator f4339a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Comparator f4340b;

    public C0660s(C10317j c10317j, C6161p c6161p) {
        this.f4339a = c10317j;
        this.f4340b = c6161p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t10, T t11) {
        int iCompare = this.f4339a.compare(t10, t11);
        if (iCompare != 0) {
            return iCompare;
        }
        return this.f4340b.compare(((SemanticsNode) t10).f4398c, ((SemanticsNode) t11).f4398c);
    }
}
