package p000;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamite.p017ho.DNTdN;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lgh implements Iterator {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f38208a;

    /* JADX INFO: renamed from: b */
    private int f38209b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f38210c;

    public lgh(ViewGroup viewGroup, int i) {
        this.f38210c = i;
        this.f38208a = viewGroup;
    }

    public lgh(lgi lgiVar, int i) {
        this.f38210c = i;
        this.f38208a = lgiVar;
        this.f38209b = 0;
    }

    public lgh(ndd nddVar, int i) {
        this.f38210c = i;
        this.f38208a = nddVar;
        this.f38209b = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f38210c) {
            case 0:
                return this.f38209b < ((lgi) this.f38208a).f38211a.length;
            case 1:
                return this.f38209b < ((ViewGroup) this.f38208a).getChildCount();
            default:
                return this.f38209b < ((ndd) this.f38208a).f42034a.f42040b;
        }
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        switch (this.f38210c) {
            case 0:
                int[] iArr = ((lgi) this.f38208a).f38211a;
                int i = this.f38209b;
                this.f38209b = i + 1;
                return Integer.valueOf(iArr[i]);
            case 1:
                Object obj = this.f38208a;
                int i2 = this.f38209b;
                this.f38209b = i2 + 1;
                View childAt = ((ViewGroup) obj).getChildAt(i2);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
            default:
                ndf ndfVar = ((ndd) this.f38208a).f42034a;
                int[] iArr2 = ndfVar.f42039a;
                int i3 = this.f38209b;
                this.f38209b = i3 + 1;
                return ndfVar.m17354d(iArr2[i3] & 31);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f38210c) {
            case 0:
                throw new UnsupportedOperationException(DNTdN.ifutftsgJcB);
            case 1:
                Object obj = this.f38208a;
                int i = this.f38209b - 1;
                this.f38209b = i;
                ((ViewGroup) obj).removeViewAt(i);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
