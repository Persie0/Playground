package p248ln;

import dm.C5207g;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kn.InterfaceC6733c;
import kotlin.collections.C6752c;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import mo.C7661i;
import p260m8.C7499b;
import p282nn.AbstractC7803a;
import p385sf.C9000b;
import tl.C9325m;
import tl.C9331s;
import tl.C9332t;
import tl.C9333u;

/* JADX INFO: renamed from: ln.g */
/* JADX INFO: loaded from: classes2.dex */
public class C7406g implements InterfaceC6733c {

    /* JADX INFO: renamed from: d */
    public static final List<String> f41224d;

    /* JADX INFO: renamed from: a */
    public final String[] f41225a;

    /* JADX INFO: renamed from: b */
    public final Set<Integer> f41226b;

    /* JADX INFO: renamed from: c */
    public final List<JvmProtoBuf.StringTableTypes.Record> f41227c;

    /* JADX INFO: renamed from: ln.g$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f41228a;

        static {
            int[] iArr = new int[JvmProtoBuf.StringTableTypes.Record.Operation.values().length];
            iArr[JvmProtoBuf.StringTableTypes.Record.Operation.NONE.ordinal()] = 1;
            iArr[JvmProtoBuf.StringTableTypes.Record.Operation.INTERNAL_TO_CLASS_ID.ordinal()] = 2;
            iArr[JvmProtoBuf.StringTableTypes.Record.Operation.DESC_TO_CLASS_ID.ordinal()] = 3;
            f41228a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        String strM13430X = C6752c.m13430X(C9000b.m17252r('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);
        List<String> listM17252r = C9000b.m17252r(strM13430X.concat("/Any"), strM13430X.concat("/Nothing"), strM13430X.concat("/Unit"), strM13430X.concat("/Throwable"), strM13430X.concat("/Number"), strM13430X.concat("/Byte"), strM13430X.concat("/Double"), strM13430X.concat("/Float"), strM13430X.concat("/Int"), strM13430X.concat("/Long"), strM13430X.concat("/Short"), strM13430X.concat("/Boolean"), strM13430X.concat("/Char"), strM13430X.concat("/CharSequence"), strM13430X.concat("/String"), strM13430X.concat("/Comparable"), strM13430X.concat("/Enum"), strM13430X.concat("/Array"), strM13430X.concat("/ByteArray"), strM13430X.concat("/DoubleArray"), strM13430X.concat("/FloatArray"), strM13430X.concat("/IntArray"), strM13430X.concat("/LongArray"), strM13430X.concat("/ShortArray"), strM13430X.concat("/BooleanArray"), strM13430X.concat("/CharArray"), strM13430X.concat("/Cloneable"), strM13430X.concat("/Annotation"), strM13430X.concat("/collections/Iterable"), strM13430X.concat("/collections/MutableIterable"), strM13430X.concat("/collections/Collection"), strM13430X.concat("/collections/MutableCollection"), strM13430X.concat("/collections/List"), strM13430X.concat("/collections/MutableList"), strM13430X.concat("/collections/Set"), strM13430X.concat("/collections/MutableSet"), strM13430X.concat("/collections/Map"), strM13430X.concat("/collections/MutableMap"), strM13430X.concat("/collections/Map.Entry"), strM13430X.concat("/collections/MutableMap.MutableEntry"), strM13430X.concat("/collections/Iterator"), strM13430X.concat("/collections/MutableIterator"), strM13430X.concat("/collections/ListIterator"), strM13430X.concat("/collections/MutableListIterator"));
        f41224d = listM17252r;
        C9332t c9332tM13458z0 = C6752c.m13458z0(listM17252r);
        int iM14941g0 = C7499b.m14941g0(C9325m.m17681z(c9332tM13458z0, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM14941g0 >= 16 ? iM14941g0 : 16);
        Iterator it = c9332tM13458z0.iterator();
        while (true) {
            C9333u c9333u = (C9333u) it;
            if (!c9333u.hasNext()) {
                return;
            }
            C9331s c9331s = (C9331s) c9333u.next();
            linkedHashMap.put((String) c9331s.f48067b, Integer.valueOf(c9331s.f48066a));
        }
    }

    public C7406g(String[] strArr, Set set, ArrayList arrayList) {
        C5207g.m11111f(set, "localNameIndices");
        this.f41225a = strArr;
        this.f41226b = set;
        this.f41227c = arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0079  */
    @Override // kn.InterfaceC6733c
    /* JADX INFO: renamed from: a */
    public final String mo13351a(int i10) {
        String strM15253S2;
        JvmProtoBuf.StringTableTypes.Record record = this.f41227c.get(i10);
        int i11 = record.f39462b;
        if ((i11 & 4) == 4) {
            Object obj = record.f39465e;
            if (obj instanceof String) {
                strM15253S2 = (String) obj;
            } else {
                AbstractC7803a abstractC7803a = (AbstractC7803a) obj;
                abstractC7803a.getClass();
                try {
                    String strMo15529v = abstractC7803a.mo15529v();
                    if (abstractC7803a.mo15524o()) {
                        record.f39465e = strMo15529v;
                    }
                    strM15253S2 = strMo15529v;
                } catch (UnsupportedEncodingException e10) {
                    throw new RuntimeException("UTF-8 not supported?", e10);
                }
            }
        } else {
            if ((i11 & 2) == 2) {
                List<String> list = f41224d;
                int size = list.size();
                int i12 = record.f39464d;
                if (i12 >= 0 && i12 < size) {
                    strM15253S2 = list.get(i12);
                } else {
                    strM15253S2 = this.f41225a[i10];
                }
            } else {
                strM15253S2 = this.f41225a[i10];
            }
        }
        if (record.f39467g.size() >= 2) {
            List<Integer> list2 = record.f39467g;
            C5207g.m11110e(list2, "substringIndexList");
            Integer num = list2.get(0);
            Integer num2 = list2.get(1);
            C5207g.m11110e(num, "begin");
            if (num.intValue() >= 0) {
                int iIntValue = num.intValue();
                C5207g.m11110e(num2, "end");
                if (iIntValue <= num2.intValue() && num2.intValue() <= strM15253S2.length()) {
                    strM15253S2 = strM15253S2.substring(num.intValue(), num2.intValue());
                    C5207g.m11110e(strM15253S2, "this as java.lang.String…ing(startIndex, endIndex)");
                }
            }
        }
        if (record.f39469i.size() >= 2) {
            List<Integer> list3 = record.f39469i;
            C5207g.m11110e(list3, "replaceCharList");
            Integer num3 = list3.get(0);
            Integer num4 = list3.get(1);
            C5207g.m11110e(strM15253S2, "string");
            strM15253S2 = C7661i.m15253S2(strM15253S2, (char) num3.intValue(), (char) num4.intValue());
        }
        JvmProtoBuf.StringTableTypes.Record.Operation operation = record.f39466f;
        if (operation == null) {
            operation = JvmProtoBuf.StringTableTypes.Record.Operation.NONE;
        }
        int i13 = a.f41228a[operation.ordinal()];
        if (i13 == 2) {
            C5207g.m11110e(strM15253S2, "string");
            strM15253S2 = C7661i.m15253S2(strM15253S2, '$', '.');
        } else if (i13 == 3) {
            if (strM15253S2.length() >= 2) {
                strM15253S2 = strM15253S2.substring(1, strM15253S2.length() - 1);
                C5207g.m11110e(strM15253S2, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            strM15253S2 = C7661i.m15253S2(strM15253S2, '$', '.');
        }
        C5207g.m11110e(strM15253S2, "string");
        return strM15253S2;
    }

    @Override // kn.InterfaceC6733c
    /* JADX INFO: renamed from: b */
    public final String mo13352b(int i10) {
        return mo13351a(i10);
    }

    @Override // kn.InterfaceC6733c
    /* JADX INFO: renamed from: c */
    public final boolean mo13353c(int i10) {
        return this.f41226b.contains(Integer.valueOf(i10));
    }
}
