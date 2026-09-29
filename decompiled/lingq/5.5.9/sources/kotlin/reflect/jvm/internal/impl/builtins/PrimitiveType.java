package kotlin.reflect.jvm.internal.impl.builtins;

import cm.InterfaceC2041a;
import java.util.Set;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import mn.C7646c;
import mn.C7648e;
import p260m8.C7499b;
import sl.InterfaceC9070c;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType, still in use, count: 1, list:
  (r0v1 kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType) from 0x0070: FILLED_NEW_ARRAY 
  (r0v1 kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType)
  (r1v2 kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType)
  (r4v2 kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType)
  (r6v2 kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType)
  (r8v2 kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType)
  (r10v2 kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType)
  (r12v2 kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType)
 A[WRAPPED] elemType: kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class PrimitiveType {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");

    public static final Set<PrimitiveType> NUMBER_TYPES = C7499b.m14973x0(new PrimitiveType("Char"), new PrimitiveType("Byte"), new PrimitiveType("Short"), new PrimitiveType("Int"), new PrimitiveType("Float"), new PrimitiveType("Long"), new PrimitiveType("Double"));
    private final InterfaceC9070c arrayTypeFqName$delegate;
    private final C7648e arrayTypeName;
    private final InterfaceC9070c typeFqName$delegate;
    private final C7648e typeName;
    public static final C6792a Companion = new Object() { // from class: kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.a
    };

    /* JADX WARN: Type inference failed for: r13v4, types: [kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType$a] */
    static {
    }

    private PrimitiveType(String str) {
        super(str, i);
        this.typeName = C7648e.m15232l(str);
        this.arrayTypeName = C7648e.m15232l(str.concat("Array"));
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.typeFqName$delegate = C6740a.m13373b(lazyThreadSafetyMode, new InterfaceC2041a<C7646c>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType$typeFqName$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C7646c mo807E() {
                return C6797e.f38344j.m15215c(this.f38318b.getTypeName());
            }
        });
        this.arrayTypeFqName$delegate = C6740a.m13373b(lazyThreadSafetyMode, new InterfaceC2041a<C7646c>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType$arrayTypeFqName$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C7646c mo807E() {
                return C6797e.f38344j.m15215c(this.f38317b.getArrayTypeName());
            }
        });
    }

    public static PrimitiveType valueOf(String str) {
        return (PrimitiveType) Enum.valueOf(PrimitiveType.class, str);
    }

    public static PrimitiveType[] values() {
        return (PrimitiveType[]) $VALUES.clone();
    }

    public final C7646c getArrayTypeFqName() {
        return (C7646c) this.arrayTypeFqName$delegate.getValue();
    }

    public final C7648e getArrayTypeName() {
        return this.arrayTypeName;
    }

    public final C7646c getTypeFqName() {
        return (C7646c) this.typeFqName$delegate.getValue();
    }

    public final C7648e getTypeName() {
        return this.typeName;
    }
}
