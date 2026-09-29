package kn;

import dm.C5207g;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable;

/* JADX INFO: renamed from: kn.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C6736f {

    /* JADX INFO: renamed from: b */
    public static final C6736f f37996b = new C6736f(EmptyList.f38032a);

    /* JADX INFO: renamed from: a */
    public final List<ProtoBuf$VersionRequirement> f37997a;

    /* JADX INFO: renamed from: kn.f$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static C6736f m13356a(ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable) {
            if (protoBuf$VersionRequirementTable.f39393b.size() == 0) {
                return C6736f.f37996b;
            }
            List<ProtoBuf$VersionRequirement> list = protoBuf$VersionRequirementTable.f39393b;
            C5207g.m11110e(list, "table.requirementList");
            return new C6736f(list);
        }
    }

    public C6736f(List<ProtoBuf$VersionRequirement> list) {
        this.f37997a = list;
    }
}
