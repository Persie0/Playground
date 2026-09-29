package kn;

import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import p385sf.C9000b;
import tl.C9325m;

/* JADX INFO: renamed from: kn.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C6735e {

    /* JADX INFO: renamed from: a */
    public final List<ProtoBuf$Type> f37995a;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C6735e(ProtoBuf$TypeTable protoBuf$TypeTable) {
        List<ProtoBuf$Type> list = protoBuf$TypeTable.f39345c;
        int i10 = 0;
        if ((protoBuf$TypeTable.f39344b & 1) == 1) {
            int i11 = protoBuf$TypeTable.f39346d;
            C5207g.m11110e(list, "typeTable.typeList");
            ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
            for (Object obj : list) {
                int i12 = i10 + 1;
                if (i10 < 0) {
                    C9000b.m17257w();
                    throw null;
                }
                ProtoBuf$Type protoBuf$TypeM13851m = (ProtoBuf$Type) obj;
                if (i10 >= i11) {
                    protoBuf$TypeM13851m.getClass();
                    ProtoBuf$Type.C6951b c6951bM13844C = ProtoBuf$Type.m13844C(protoBuf$TypeM13851m);
                    c6951bM13844C.f39286d |= 2;
                    c6951bM13844C.f39288f = true;
                    protoBuf$TypeM13851m = c6951bM13844C.m13851m();
                    if (!protoBuf$TypeM13851m.mo13780b()) {
                        throw new UninitializedMessageException();
                    }
                }
                arrayList.add(protoBuf$TypeM13851m);
                i10 = i12;
            }
            list = arrayList;
        }
        C5207g.m11110e(list, "run {\n        val origin… else originalTypes\n    }");
        this.f37995a = list;
    }

    /* JADX INFO: renamed from: a */
    public final ProtoBuf$Type m13355a(int i10) {
        return this.f37995a.get(i10);
    }
}
