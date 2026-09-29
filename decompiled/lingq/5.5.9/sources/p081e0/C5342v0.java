package p081e0;

import ae.C0062b;
import androidx.compose.runtime.C0479d;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerKt;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import p100em.InterfaceC5429a;

/* JADX INFO: renamed from: e0.v0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5342v0 implements Iterable<Object>, InterfaceC5429a {

    /* JADX INFO: renamed from: b */
    public int f33625b;

    /* JADX INFO: renamed from: d */
    public int f33627d;

    /* JADX INFO: renamed from: e */
    public int f33628e;

    /* JADX INFO: renamed from: f */
    public boolean f33629f;

    /* JADX INFO: renamed from: g */
    public int f33630g;

    /* JADX INFO: renamed from: a */
    public int[] f33624a = new int[0];

    /* JADX INFO: renamed from: c */
    public Object[] f33626c = new Object[0];

    /* JADX INFO: renamed from: h */
    public ArrayList<C5296b> f33631h = new ArrayList<>();

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: a */
    public final C5296b m11468a() {
        if (!(!this.f33629f)) {
            ComposerKt.m1687c("use active SlotWriter to create an anchor location instead ".toString());
            throw null;
        }
        int i10 = this.f33625b;
        if (!(i10 > 0)) {
            throw new IllegalArgumentException("Parameter index is out of range".toString());
        }
        ArrayList<C5296b> arrayList = this.f33631h;
        int iM323X1 = C0062b.m323X1(arrayList, 0, i10);
        if (iM323X1 < 0) {
            C5296b c5296b = new C5296b(0);
            arrayList.add(-(iM323X1 + 1), c5296b);
            return c5296b;
        }
        C5296b c5296b2 = arrayList.get(iM323X1);
        C5207g.m11110e(c5296b2, "get(location)");
        return c5296b2;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: f */
    public final int m11469f(C5296b c5296b) {
        C5207g.m11111f(c5296b, "anchor");
        if (!(!this.f33629f)) {
            ComposerKt.m1687c("Use active SlotWriter to determine anchor location instead".toString());
            throw null;
        }
        if (c5296b.m11434a()) {
            return c5296b.f33569a;
        }
        throw new IllegalArgumentException("Anchor refers to a group that was removed".toString());
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: g */
    public final boolean m11470g(int i10, C5296b c5296b) {
        if (!(!this.f33629f)) {
            ComposerKt.m1687c("Writer is active".toString());
            throw null;
        }
        if (!(i10 >= 0 && i10 < this.f33625b)) {
            ComposerKt.m1687c("Invalid group index".toString());
            throw null;
        }
        if (m11473m(c5296b)) {
            int iM404v = C0062b.m404v(this.f33624a, i10) + i10;
            int i11 = c5296b.f33569a;
            if (i10 <= i11 && i11 < iM404v) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: i */
    public final C0479d m11471i() {
        if (this.f33629f) {
            throw new IllegalStateException("Cannot read while a writer is pending".toString());
        }
        this.f33628e++;
        return new C0479d(this);
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return new C5337t(0, this.f33625b, this);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: l */
    public final C0480e m11472l() {
        if (!(!this.f33629f)) {
            ComposerKt.m1687c("Cannot start a writer when another writer is pending".toString());
            throw null;
        }
        if (!(this.f33628e <= 0)) {
            ComposerKt.m1687c("Cannot start a writer when a reader is pending".toString());
            throw null;
        }
        this.f33629f = true;
        this.f33630g++;
        return new C0480e(this);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m11473m(C5296b c5296b) {
        if (!c5296b.m11434a()) {
            return false;
        }
        int iM323X1 = C0062b.m323X1(this.f33631h, c5296b.f33569a, this.f33625b);
        return iM323X1 >= 0 && C5207g.m11106a(this.f33631h.get(iM323X1), c5296b);
    }
}
