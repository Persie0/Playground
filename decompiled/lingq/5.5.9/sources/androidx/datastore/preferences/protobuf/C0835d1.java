package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.d1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0835d1 extends AbstractC0829b1<C0832c1, C0832c1> {
    @Override // androidx.datastore.preferences.protobuf.AbstractC0829b1
    /* JADX INFO: renamed from: a */
    public final void mo3173a(int i10, int i11, Object obj) {
        ((C0832c1) obj).m3198b((i10 << 3) | 5, Integer.valueOf(i11));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0829b1
    /* JADX INFO: renamed from: b */
    public final void mo3174b(int i10, long j10, Object obj) {
        ((C0832c1) obj).m3198b((i10 << 3) | 1, Long.valueOf(j10));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0829b1
    /* JADX INFO: renamed from: c */
    public final void mo3175c(C0832c1 c0832c1, int i10, C0832c1 c0832c2) {
        c0832c1.m3198b((i10 << 3) | 3, c0832c2);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0829b1
    /* JADX INFO: renamed from: d */
    public final void mo3176d(C0832c1 c0832c1, int i10, ByteString byteString) {
        c0832c1.m3198b((i10 << 3) | 2, byteString);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0829b1
    /* JADX INFO: renamed from: e */
    public final void mo3177e(int i10, long j10, Object obj) {
        ((C0832c1) obj).m3198b((i10 << 3) | 0, Long.valueOf(j10));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0829b1
    /* JADX INFO: renamed from: f */
    public final C0832c1 mo3178f(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        C0832c1 c0832c1 = generatedMessageLite.unknownFields;
        if (c0832c1 != C0832c1.f5830f) {
            return c0832c1;
        }
        C0832c1 c0832c2 = new C0832c1();
        generatedMessageLite.unknownFields = c0832c2;
        return c0832c2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0829b1
    /* JADX INFO: renamed from: g */
    public final C0832c1 mo3179g(Object obj) {
        return ((GeneratedMessageLite) obj).unknownFields;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0829b1
    /* JADX INFO: renamed from: h */
    public final int mo3180h(C0832c1 c0832c1) {
        return c0832c1.m3197a();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0829b1
    /* JADX INFO: renamed from: i */
    public final int mo3181i(C0832c1 c0832c1) {
        C0832c1 c0832c2 = c0832c1;
        int i10 = c0832c2.f5834d;
        if (i10 != -1) {
            return i10;
        }
        int iM3067c = 0;
        for (int i11 = 0; i11 < c0832c2.f5831a; i11++) {
            int i12 = c0832c2.f5832b[i11] >>> 3;
            iM3067c += CodedOutputStream.m3067c(3, (ByteString) c0832c2.f5833c[i11]) + CodedOutputStream.m3085u(2, i12) + (CodedOutputStream.m3084t(1) * 2);
        }
        c0832c2.f5834d = iM3067c;
        return iM3067c;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0829b1
    /* JADX INFO: renamed from: j */
    public final void mo3182j(Object obj) {
        ((GeneratedMessageLite) obj).unknownFields.f5835e = false;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0829b1
    /* JADX INFO: renamed from: k */
    public final C0832c1 mo3183k(Object obj, Object obj2) {
        C0832c1 c0832c1 = (C0832c1) obj;
        C0832c1 c0832c2 = (C0832c1) obj2;
        if (c0832c2.equals(C0832c1.f5830f)) {
            return c0832c1;
        }
        int i10 = c0832c1.f5831a + c0832c2.f5831a;
        int[] iArrCopyOf = Arrays.copyOf(c0832c1.f5832b, i10);
        System.arraycopy(c0832c2.f5832b, 0, iArrCopyOf, c0832c1.f5831a, c0832c2.f5831a);
        Object[] objArrCopyOf = Arrays.copyOf(c0832c1.f5833c, i10);
        System.arraycopy(c0832c2.f5833c, 0, objArrCopyOf, c0832c1.f5831a, c0832c2.f5831a);
        return new C0832c1(i10, iArrCopyOf, objArrCopyOf, true);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0829b1
    /* JADX INFO: renamed from: m */
    public final C0832c1 mo3185m() {
        return new C0832c1();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0829b1
    /* JADX INFO: renamed from: n */
    public final void mo3186n(Object obj, C0832c1 c0832c1) {
        ((GeneratedMessageLite) obj).unknownFields = c0832c1;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0829b1
    /* JADX INFO: renamed from: o */
    public final void mo3187o(Object obj, C0832c1 c0832c1) {
        ((GeneratedMessageLite) obj).unknownFields = c0832c1;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0829b1
    /* JADX INFO: renamed from: p */
    public final void mo3188p() {
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0829b1
    /* JADX INFO: renamed from: q */
    public final C0832c1 mo3189q(Object obj) {
        C0832c1 c0832c1 = (C0832c1) obj;
        c0832c1.f5835e = false;
        return c0832c1;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0829b1
    /* JADX INFO: renamed from: r */
    public final void mo3190r(Object obj, C0849j c0849j) throws IOException {
        C0832c1 c0832c1 = (C0832c1) obj;
        c0832c1.getClass();
        c0849j.getClass();
        if (Writer$FieldOrder.ASCENDING != Writer$FieldOrder.DESCENDING) {
            for (int i10 = 0; i10 < c0832c1.f5831a; i10++) {
                c0849j.m3355l(c0832c1.f5832b[i10] >>> 3, c0832c1.f5833c[i10]);
            }
            return;
        }
        int i11 = c0832c1.f5831a;
        while (true) {
            i11--;
            if (i11 < 0) {
                return;
            } else {
                c0849j.m3355l(c0832c1.f5832b[i11] >>> 3, c0832c1.f5833c[i11]);
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0829b1
    /* JADX INFO: renamed from: s */
    public final void mo3191s(Object obj, C0849j c0849j) throws IOException {
        ((C0832c1) obj).m3199c(c0849j);
    }
}
