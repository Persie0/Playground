package p248ln;

import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.C6752c;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;

/* JADX INFO: renamed from: ln.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C7405f extends C7406g {
    public C7405f(JvmProtoBuf.StringTableTypes stringTableTypes, String[] strArr) {
        List<Integer> list = stringTableTypes.f39455c;
        Set setM13457y0 = list.isEmpty() ? EmptySet.f38034a : C6752c.m13457y0(list);
        List<JvmProtoBuf.StringTableTypes.Record> list2 = stringTableTypes.f39454b;
        C5207g.m11110e(list2, "types.recordList");
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(list2.size());
        for (JvmProtoBuf.StringTableTypes.Record record : list2) {
            int i10 = record.f39463c;
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList.add(record);
            }
        }
        arrayList.trimToSize();
        super(strArr, setM13457y0, arrayList);
    }
}
