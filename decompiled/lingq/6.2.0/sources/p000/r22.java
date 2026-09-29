package p000;

import androidx.datastore.preferences.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes3.dex */
@ey8(with = s22.class)
public abstract class r22 {
    public static final i22 Companion = new i22();

    /* JADX INFO: renamed from: a */
    public static final m22 f58514a;

    /* JADX INFO: renamed from: b */
    public static final o22 f58515b;

    /* JADX INFO: renamed from: c */
    public static final o22 f58516c;

    static {
        new q22(1L).m19615b(DescriptorProtos.Edition.EDITION_2023_VALUE).m19615b(DescriptorProtos.Edition.EDITION_2023_VALUE).m19615b(DescriptorProtos.Edition.EDITION_2023_VALUE).m19615b(60).m19615b(60);
        f58514a = new m22(1);
        new m22(Math.multiplyExact(1, 7));
        f58515b = new o22(1);
        new o22(Math.multiplyExact(1, 3));
        int iMultiplyExact = Math.multiplyExact(1, 12);
        f58516c = new o22(iMultiplyExact);
        new o22(Math.multiplyExact(iMultiplyExact, 100));
    }

    /* JADX INFO: renamed from: a */
    public static String m20252a(int i, String str) {
        if (i == 1) {
            return str;
        }
        return i + '-' + str;
    }
}
