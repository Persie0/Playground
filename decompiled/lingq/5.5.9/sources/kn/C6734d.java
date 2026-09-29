package kn;

import dm.C5207g;
import java.util.LinkedList;
import java.util.List;
import kotlin.Triple;
import kotlin.collections.C6752c;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable;

/* JADX INFO: renamed from: kn.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C6734d implements InterfaceC6733c {

    /* JADX INFO: renamed from: a */
    public final ProtoBuf$StringTable f37992a;

    /* JADX INFO: renamed from: b */
    public final ProtoBuf$QualifiedNameTable f37993b;

    /* JADX INFO: renamed from: kn.d$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f37994a;

        static {
            int[] iArr = new int[ProtoBuf$QualifiedNameTable.QualifiedName.Kind.values().length];
            iArr[ProtoBuf$QualifiedNameTable.QualifiedName.Kind.CLASS.ordinal()] = 1;
            iArr[ProtoBuf$QualifiedNameTable.QualifiedName.Kind.PACKAGE.ordinal()] = 2;
            iArr[ProtoBuf$QualifiedNameTable.QualifiedName.Kind.LOCAL.ordinal()] = 3;
            f37994a = iArr;
        }
    }

    public C6734d(ProtoBuf$StringTable protoBuf$StringTable, ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable) {
        this.f37992a = protoBuf$StringTable;
        this.f37993b = protoBuf$QualifiedNameTable;
    }

    @Override // kn.InterfaceC6733c
    /* JADX INFO: renamed from: a */
    public final String mo13351a(int i10) {
        String str = (String) this.f37992a.f39241b.get(i10);
        C5207g.m11110e(str, "strings.getString(index)");
        return str;
    }

    @Override // kn.InterfaceC6733c
    /* JADX INFO: renamed from: b */
    public final String mo13352b(int i10) {
        Triple<List<String>, List<String>, Boolean> tripleM13354d = m13354d(i10);
        List<String> list = tripleM13354d.f38021a;
        String strM13430X = C6752c.m13430X(tripleM13354d.f38022b, ".", null, null, null, 62);
        if (list.isEmpty()) {
            return strM13430X;
        }
        return C6752c.m13430X(list, "/", null, null, null, 62) + '/' + strM13430X;
    }

    @Override // kn.InterfaceC6733c
    /* JADX INFO: renamed from: c */
    public final boolean mo13353c(int i10) {
        return m13354d(i10).f38023c.booleanValue();
    }

    /* JADX INFO: renamed from: d */
    public final Triple<List<String>, List<String>, Boolean> m13354d(int i10) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z10 = false;
        while (i10 != -1) {
            ProtoBuf$QualifiedNameTable.QualifiedName qualifiedName = this.f37993b.f39220b.get(i10);
            String str = (String) this.f37992a.f39241b.get(qualifiedName.f39228d);
            ProtoBuf$QualifiedNameTable.QualifiedName.Kind kind = qualifiedName.f39229e;
            C5207g.m11108c(kind);
            int i11 = a.f37994a[kind.ordinal()];
            if (i11 == 1) {
                linkedList2.addFirst(str);
            } else if (i11 == 2) {
                linkedList.addFirst(str);
            } else if (i11 == 3) {
                linkedList2.addFirst(str);
                z10 = true;
            }
            i10 = qualifiedName.f39227c;
        }
        return new Triple<>(linkedList, linkedList2, Boolean.valueOf(z10));
    }
}
