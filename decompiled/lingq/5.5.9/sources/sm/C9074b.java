package sm;

/* JADX INFO: renamed from: sm.b */
/* JADX INFO: loaded from: classes2.dex */
public class C9074b implements InterfaceC9073a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC9077e f47361a;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C9074b(InterfaceC9077e interfaceC9077e) {
        if (interfaceC9077e != null) {
            this.f47361a = interfaceC9077e;
        } else {
            m17278N(0);
            throw null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m17278N(int i10) {
        String str = i10 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 1 ? 3 : 2];
        if (i10 != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i10 != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i10 != 1) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 == 1) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // sm.InterfaceC9073a
    /* JADX INFO: renamed from: w */
    public InterfaceC9077e mo11289w() {
        InterfaceC9077e interfaceC9077e = this.f47361a;
        if (interfaceC9077e != null) {
            return interfaceC9077e;
        }
        m17278N(1);
        throw null;
    }
}
