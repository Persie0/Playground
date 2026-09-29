package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import dm.C5207g;
import java.util.LinkedHashMap;
import java.util.Map;
import p248ln.C7404e;
import p260m8.C7499b;

/* JADX INFO: loaded from: classes2.dex */
public final class KotlinClassHeader {

    /* JADX INFO: renamed from: a */
    public final Kind f38908a;

    /* JADX INFO: renamed from: b */
    public final C7404e f38909b;

    /* JADX INFO: renamed from: c */
    public final String[] f38910c;

    /* JADX INFO: renamed from: d */
    public final String[] f38911d;

    /* JADX INFO: renamed from: e */
    public final String[] f38912e;

    /* JADX INFO: renamed from: f */
    public final String f38913f;

    /* JADX INFO: renamed from: g */
    public final int f38914g;

    public enum Kind {
        UNKNOWN(0),
        CLASS(1),
        FILE_FACADE(2),
        SYNTHETIC_CLASS(3),
        MULTIFILE_CLASS(4),
        MULTIFILE_CLASS_PART(5);

        public static final C6900a Companion = new C6900a();
        private static final Map<Integer, Kind> entryById;

        /* JADX INFO: renamed from: id */
        private final int f38915id;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind$a */
        public static final class C6900a {
        }

        static {
            Kind[] kindArrValues = values();
            int iM14941g0 = C7499b.m14941g0(kindArrValues.length);
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM14941g0 < 16 ? 16 : iM14941g0);
            for (Kind kind : kindArrValues) {
                linkedHashMap.put(Integer.valueOf(kind.f38915id), kind);
            }
            entryById = linkedHashMap;
        }

        Kind(int i10) {
            this.f38915id = i10;
        }

        public static final Kind getById(int i10) {
            Companion.getClass();
            Kind kind = (Kind) entryById.get(Integer.valueOf(i10));
            return kind == null ? UNKNOWN : kind;
        }
    }

    public KotlinClassHeader(Kind kind, C7404e c7404e, String[] strArr, String[] strArr2, String[] strArr3, String str, int i10) {
        C5207g.m11111f(kind, "kind");
        this.f38908a = kind;
        this.f38909b = c7404e;
        this.f38910c = strArr;
        this.f38911d = strArr2;
        this.f38912e = strArr3;
        this.f38913f = str;
        this.f38914g = i10;
    }

    public final String toString() {
        return this.f38908a + " version=" + this.f38909b;
    }
}
