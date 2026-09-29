package p541zn;

import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p420um.AbstractC9557b;

/* JADX INFO: renamed from: zn.l */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC10548l {

    /* JADX INFO: renamed from: b */
    public static final a f52601b = new a();

    /* JADX INFO: renamed from: zn.l$a */
    public static class a implements InterfaceC10548l {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m19522a(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "unresolvedSuperClasses";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
            if (i10 != 2) {
                objArr[2] = "reportIncompleteHierarchy";
            } else {
                objArr[2] = "reportCannotInferVisibility";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p541zn.InterfaceC10548l
        /* JADX INFO: renamed from: b */
        public final void mo16920b(AbstractC9557b abstractC9557b, ArrayList arrayList) {
            if (abstractC9557b != null) {
                return;
            }
            m19522a(0);
            throw null;
        }

        @Override // p541zn.InterfaceC10548l
        /* JADX INFO: renamed from: c */
        public final void mo16921c(CallableMemberDescriptor callableMemberDescriptor) {
            if (callableMemberDescriptor != null) {
                return;
            }
            m19522a(2);
            throw null;
        }
    }

    /* JADX INFO: renamed from: b */
    void mo16920b(AbstractC9557b abstractC9557b, ArrayList arrayList);

    /* JADX INFO: renamed from: c */
    void mo16921c(CallableMemberDescriptor callableMemberDescriptor);
}
