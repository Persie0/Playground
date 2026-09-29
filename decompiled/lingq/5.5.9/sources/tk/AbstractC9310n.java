package tk;

import com.squareup.moshi.C4952n;
import com.squareup.moshi.JsonDataException;
import dm.C5206f;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: tk.n */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9310n implements Closeable, Flushable {

    /* JADX INFO: renamed from: e */
    public boolean f48046e;

    /* JADX INFO: renamed from: f */
    public boolean f48047f;

    /* JADX INFO: renamed from: g */
    public boolean f48048g;

    /* JADX INFO: renamed from: a */
    public int f48042a = 0;

    /* JADX INFO: renamed from: b */
    public int[] f48043b = new int[32];

    /* JADX INFO: renamed from: c */
    public String[] f48044c = new String[32];

    /* JADX INFO: renamed from: d */
    public int[] f48045d = new int[32];

    /* JADX INFO: renamed from: h */
    public int f48049h = -1;

    /* JADX INFO: renamed from: C */
    public abstract AbstractC9310n mo10551C(String str) throws IOException;

    /* JADX INFO: renamed from: E */
    public abstract AbstractC9310n mo10552E() throws IOException;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: G */
    public final int m17652G() {
        int i10 = this.f48042a;
        if (i10 != 0) {
            return this.f48043b[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* JADX INFO: renamed from: H */
    public final void m17653H(int i10) {
        int[] iArr = this.f48043b;
        int i11 = this.f48042a;
        this.f48042a = i11 + 1;
        iArr[i11] = i10;
    }

    /* JADX INFO: renamed from: Q */
    public abstract AbstractC9310n mo10553Q(double d10) throws IOException;

    /* JADX INFO: renamed from: U */
    public abstract AbstractC9310n mo10554U(long j10) throws IOException;

    /* JADX INFO: renamed from: a */
    public abstract AbstractC9310n mo10555a() throws IOException;

    /* JADX INFO: renamed from: b */
    public abstract AbstractC9310n mo10556b() throws IOException;

    /* JADX INFO: renamed from: d0 */
    public abstract AbstractC9310n mo10557d0(Number number) throws IOException;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: l */
    public final void m17654l() {
        int i10 = this.f48042a;
        int[] iArr = this.f48043b;
        if (i10 != iArr.length) {
            return;
        }
        if (i10 == 256) {
            throw new JsonDataException("Nesting too deep at " + m17655w() + ": circular reference?");
        }
        this.f48043b = Arrays.copyOf(iArr, iArr.length * 2);
        String[] strArr = this.f48044c;
        this.f48044c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        int[] iArr2 = this.f48045d;
        this.f48045d = Arrays.copyOf(iArr2, iArr2.length * 2);
        if (this instanceof C4952n) {
            C4952n c4952n = (C4952n) this;
            Object[] objArr = c4952n.f32263i;
            c4952n.f32263i = Arrays.copyOf(objArr, objArr.length * 2);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public abstract AbstractC9310n mo10558m0(String str) throws IOException;

    /* JADX INFO: renamed from: q */
    public abstract AbstractC9310n mo10559q() throws IOException;

    /* JADX INFO: renamed from: r */
    public abstract AbstractC9310n mo10560r() throws IOException;

    /* JADX INFO: renamed from: s0 */
    public abstract AbstractC9310n mo10561s0(boolean z10) throws IOException;

    /* JADX INFO: renamed from: w */
    public final String m17655w() {
        return C5206f.m11004Z0(this.f48042a, this.f48043b, this.f48044c, this.f48045d);
    }
}
