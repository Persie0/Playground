package p541zn;

import androidx.datastore.preferences.PreferencesProto$Value;
import dm.C5207g;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$MemberKind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility;
import p372rm.AbstractC8848l;
import p372rm.C8850m;

/* JADX INFO: renamed from: zn.t */
/* JADX INFO: loaded from: classes2.dex */
public final class C10556t {

    /* JADX INFO: renamed from: zn.t$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f52625a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f52626b;

        static {
            int[] iArr = new int[ProtoBuf$MemberKind.values().length];
            iArr[ProtoBuf$MemberKind.DECLARATION.ordinal()] = 1;
            iArr[ProtoBuf$MemberKind.FAKE_OVERRIDE.ordinal()] = 2;
            iArr[ProtoBuf$MemberKind.DELEGATION.ordinal()] = 3;
            iArr[ProtoBuf$MemberKind.SYNTHESIZED.ordinal()] = 4;
            f52625a = iArr;
            int[] iArr2 = new int[CallableMemberDescriptor.Kind.values().length];
            iArr2[CallableMemberDescriptor.Kind.DECLARATION.ordinal()] = 1;
            iArr2[CallableMemberDescriptor.Kind.FAKE_OVERRIDE.ordinal()] = 2;
            iArr2[CallableMemberDescriptor.Kind.DELEGATION.ordinal()] = 3;
            iArr2[CallableMemberDescriptor.Kind.SYNTHESIZED.ordinal()] = 4;
            int[] iArr3 = new int[ProtoBuf$Visibility.values().length];
            iArr3[ProtoBuf$Visibility.INTERNAL.ordinal()] = 1;
            iArr3[ProtoBuf$Visibility.PRIVATE.ordinal()] = 2;
            iArr3[ProtoBuf$Visibility.PRIVATE_TO_THIS.ordinal()] = 3;
            iArr3[ProtoBuf$Visibility.PROTECTED.ordinal()] = 4;
            iArr3[ProtoBuf$Visibility.PUBLIC.ordinal()] = 5;
            iArr3[ProtoBuf$Visibility.LOCAL.ordinal()] = 6;
            f52626b = iArr3;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static final AbstractC8848l m19526a(ProtoBuf$Visibility protoBuf$Visibility) {
        switch (protoBuf$Visibility == null ? -1 : a.f52626b[protoBuf$Visibility.ordinal()]) {
            case 1:
                C8850m.g gVar = C8850m.f46737d;
                C5207g.m11110e(gVar, "INTERNAL");
                return gVar;
            case 2:
                C8850m.d dVar = C8850m.f46734a;
                C5207g.m11110e(dVar, "PRIVATE");
                return dVar;
            case 3:
                C8850m.e eVar = C8850m.f46735b;
                C5207g.m11110e(eVar, "PRIVATE_TO_THIS");
                return eVar;
            case 4:
                C8850m.f fVar = C8850m.f46736c;
                C5207g.m11110e(fVar, "PROTECTED");
                return fVar;
            case 5:
                C8850m.h hVar = C8850m.f46738e;
                C5207g.m11110e(hVar, "PUBLIC");
                return hVar;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                C8850m.i iVar = C8850m.f46739f;
                C5207g.m11110e(iVar, "LOCAL");
                return iVar;
            default:
                C8850m.d dVar2 = C8850m.f46734a;
                C5207g.m11110e(dVar2, "PRIVATE");
                return dVar2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final CallableMemberDescriptor.Kind m19527b(ProtoBuf$MemberKind protoBuf$MemberKind) {
        int i10 = protoBuf$MemberKind == null ? -1 : a.f52625a[protoBuf$MemberKind.ordinal()];
        if (i10 == 1) {
            return CallableMemberDescriptor.Kind.DECLARATION;
        }
        if (i10 == 2) {
            return CallableMemberDescriptor.Kind.FAKE_OVERRIDE;
        }
        if (i10 != 3) {
            return i10 != 4 ? CallableMemberDescriptor.Kind.DECLARATION : CallableMemberDescriptor.Kind.SYNTHESIZED;
        }
        return CallableMemberDescriptor.Kind.DELEGATION;
    }
}
