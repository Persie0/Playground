package com.squareup.moshi;

import dm.C5206f;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import okio.ByteString;
import p003a2.C0009a;
import p124fp.C5608e;
import p124fp.C5619p;
import tk.C9309m;

/* JADX INFO: loaded from: classes2.dex */
public abstract class JsonReader implements Closeable {

    /* JADX INFO: renamed from: a */
    public int f32175a;

    /* JADX INFO: renamed from: b */
    public int[] f32176b = new int[32];

    /* JADX INFO: renamed from: c */
    public String[] f32177c = new String[32];

    /* JADX INFO: renamed from: d */
    public int[] f32178d = new int[32];

    /* JADX INFO: renamed from: e */
    public boolean f32179e;

    /* JADX INFO: renamed from: f */
    public boolean f32180f;

    public enum Token {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    /* JADX INFO: renamed from: com.squareup.moshi.JsonReader$a */
    public static final class C4932a {

        /* JADX INFO: renamed from: a */
        public final String[] f32181a;

        /* JADX INFO: renamed from: b */
        public final C5619p f32182b;

        public C4932a(String[] strArr, C5619p c5619p) {
            this.f32181a = strArr;
            this.f32182b = c5619p;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public static C4932a m10513a(String... strArr) {
            try {
                ByteString[] byteStringArr = new ByteString[strArr.length];
                C5608e c5608e = new C5608e();
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    C9309m.m17647I0(c5608e, strArr[i10]);
                    c5608e.readByte();
                    byteStringArr[i10] = c5608e.m11976y0();
                }
                return new C4932a((String[]) strArr.clone(), C5619p.a.m11998b(byteStringArr));
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    /* JADX INFO: renamed from: B0 */
    public abstract int mo10492B0(C4932a c4932a) throws IOException;

    /* JADX INFO: renamed from: C */
    public abstract boolean mo10493C() throws IOException;

    /* JADX INFO: renamed from: E */
    public abstract double mo10494E() throws IOException;

    /* JADX INFO: renamed from: G */
    public abstract int mo10495G() throws IOException;

    /* JADX INFO: renamed from: G0 */
    public abstract void mo10496G0() throws IOException;

    /* JADX INFO: renamed from: H */
    public abstract long mo10497H() throws IOException;

    /* JADX INFO: renamed from: I0 */
    public abstract void mo10498I0() throws IOException;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: N0 */
    public final void m10499N0(String str) throws JsonEncodingException {
        StringBuilder sbM26o = C0009a.m26o(str, " at path ");
        sbM26o.append(m10509r());
        throw new JsonEncodingException(sbM26o.toString());
    }

    /* JADX INFO: renamed from: P0 */
    public final JsonDataException m10500P0(Object obj, Object obj2) {
        if (obj == null) {
            return new JsonDataException("Expected " + obj2 + " but was null at path " + m10509r());
        }
        return new JsonDataException("Expected " + obj2 + " but was " + obj + ", a " + obj.getClass().getName() + ", at path " + m10509r());
    }

    /* JADX INFO: renamed from: Q */
    public abstract void mo10501Q() throws IOException;

    /* JADX INFO: renamed from: U */
    public abstract String mo10502U() throws IOException;

    /* JADX INFO: renamed from: a */
    public abstract void mo10503a() throws IOException;

    /* JADX INFO: renamed from: b */
    public abstract void mo10504b() throws IOException;

    /* JADX INFO: renamed from: d0 */
    public abstract Token mo10505d0() throws IOException;

    /* JADX INFO: renamed from: l */
    public abstract void mo10506l() throws IOException;

    /* JADX INFO: renamed from: m0 */
    public abstract void mo10507m0() throws IOException;

    /* JADX INFO: renamed from: q */
    public abstract void mo10508q() throws IOException;

    /* JADX INFO: renamed from: r */
    public final String m10509r() {
        return C5206f.m11004Z0(this.f32175a, this.f32176b, this.f32177c, this.f32178d);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m10510s0(int i10) {
        int i11 = this.f32175a;
        int[] iArr = this.f32176b;
        if (i11 == iArr.length) {
            if (i11 == 256) {
                throw new JsonDataException("Nesting too deep at " + m10509r());
            }
            this.f32176b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f32177c;
            this.f32177c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f32178d;
            this.f32178d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f32176b;
        int i12 = this.f32175a;
        this.f32175a = i12 + 1;
        iArr3[i12] = i10;
    }

    /* JADX INFO: renamed from: w */
    public abstract boolean mo10511w() throws IOException;

    /* JADX INFO: renamed from: y0 */
    public abstract int mo10512y0(C4932a c4932a) throws IOException;
}
