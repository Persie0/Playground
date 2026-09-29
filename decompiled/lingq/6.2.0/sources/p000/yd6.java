package p000;

/* JADX INFO: loaded from: classes.dex */
public final class yd6 extends ce6 {

    /* JADX INFO: renamed from: s */
    public final Class f69694s;

    public yd6(Class cls) {
        super(0, cls);
        if (cls.isEnum()) {
            this.f69694s = cls;
        } else {
            v63.m23131i(cls, " is not an Enum type.");
            throw null;
        }
    }

    @Override // p000.ce6, p000.de6
    /* JADX INFO: renamed from: b */
    public final String mo302b() {
        return this.f69694s.getName();
    }

    @Override // p000.ce6
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final Enum mo303d(String str) {
        Object obj;
        str.getClass();
        Class cls = this.f69694s;
        Object[] enumConstants = cls.getEnumConstants();
        enumConstants.getClass();
        int length = enumConstants.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                obj = null;
                break;
            }
            obj = enumConstants[i];
            if (cl9.m4834Q(((Enum) obj).name(), str, true)) {
                break;
            }
            i++;
        }
        Enum r3 = (Enum) obj;
        if (r3 != null) {
            return r3;
        }
        StringBuilder sbM17742q = AbstractC3393o1.m17742q("Enum value ", str, " not found for type ");
        sbM17742q.append(cls.getName());
        sbM17742q.append('.');
        throw new IllegalArgumentException(sbM17742q.toString());
    }
}
