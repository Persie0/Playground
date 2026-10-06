package p000;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class owq extends ood implements onm {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f46731a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f46732b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public owq(List list, int i) {
        super(2);
        this.f46732b = i;
        this.f46731a = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public owq(own ownVar, int i) {
        super(2);
        this.f46732b = i;
        this.f46731a = ownVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0071  */
    /* JADX WARN: Code duplicated, block: B:33:0x0078  */
    /* JADX WARN: Code duplicated, block: B:56:0x0108 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x010a A[LOOP:0: B:46:0x00d8->B:57:0x010a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x013f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0141 A[LOOP:2: B:61:0x0115->B:72:0x0141, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:78:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:33:0x0078, please report this as an issue */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Iterable, java.lang.Object, java.util.Collection, java.util.List] */
    @Override // p000.onm
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object mo560a(Object obj, Object obj2) {
        Object next;
        String str;
        okb okbVarM15590q;
        String str2;
        Object next2;
        String str3;
        String str4;
        int length;
        ory oryVar = null;
        switch (this.f46732b) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                olv olvVar = (olv) obj2;
                olw key = olvVar.getKey();
                olv olvVar2 = ((own) this.f46731a).f46725b.get(key);
                if (key != ory.f46473c) {
                    return Integer.valueOf(olvVar != olvVar2 ? Integer.MIN_VALUE : iIntValue + 1);
                }
                ory oryVar2 = (ory) olvVar2;
                ory oryVarMo18902c = (ory) olvVar;
                while (oryVarMo18902c != null) {
                    if (oryVarMo18902c == oryVar2 || !(oryVarMo18902c instanceof oxw)) {
                        oryVar = oryVarMo18902c;
                        if (oryVar == oryVar2) {
                            if (oryVar2 != null) {
                                iIntValue++;
                            }
                            return Integer.valueOf(iIntValue);
                        }
                        throw new IllegalStateException("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + oryVar + ", expected child of " + oryVar2 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'");
                    }
                    oqc oqcVarM19012cX = ((oxw) oryVarMo18902c).m19012cX();
                    oryVarMo18902c = oqcVarM19012cX != null ? oqcVarM19012cX.mo18902c() : null;
                }
                if (oryVar == oryVar2) {
                    if (oryVar2 != null) {
                        iIntValue++;
                    }
                    return Integer.valueOf(iIntValue);
                }
                throw new IllegalStateException("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + oryVar + ", expected child of " + oryVar2 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'");
            default:
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                charSequence.getClass();
                ?? r0 = this.f46731a;
                if (r0.size() == 1) {
                    switch (r0.size()) {
                        case 0:
                            throw new NoSuchElementException("List is empty.");
                        case 1:
                            String str5 = (String) r0.get(0);
                            int iM18808v = ook.m18808v(charSequence, str5, iIntValue2, 4);
                            okbVarM15590q = iM18808v >= 0 ? lkm.m15590q(Integer.valueOf(iM18808v), str5) : null;
                            break;
                        default:
                            throw new IllegalArgumentException("List has more than one element.");
                    }
                } else {
                    oot ootVar = new oot(ook.m18789c(iIntValue2, 0), charSequence.length());
                    if (charSequence instanceof String) {
                        int i = ootVar.f46357a;
                        int i2 = ootVar.f46358b;
                        if (i > i2) {
                            okbVarM15590q = null;
                        } else {
                            while (true) {
                                Iterator it = r0.iterator();
                                do {
                                    if (it.hasNext()) {
                                        next2 = it.next();
                                        str4 = (String) next2;
                                        length = str4.length();
                                        str4.getClass();
                                    } else {
                                        next2 = null;
                                    }
                                    str3 = (String) next2;
                                    if (str3 != null) {
                                        okbVarM15590q = lkm.m15590q(Integer.valueOf(i), str3);
                                    } else if (i != i2) {
                                        i++;
                                    } else {
                                        okbVarM15590q = null;
                                    }
                                } while (!str4.regionMatches(0, (String) charSequence, i, length));
                                str3 = (String) next2;
                                if (str3 != null) {
                                    okbVarM15590q = lkm.m15590q(Integer.valueOf(i), str3);
                                } else if (i != i2) {
                                    i++;
                                } else {
                                    okbVarM15590q = null;
                                }
                            }
                        }
                    } else {
                        int i3 = ootVar.f46357a;
                        int i4 = ootVar.f46358b;
                        if (i3 > i4) {
                            okbVarM15590q = null;
                        } else {
                            while (true) {
                                Iterator it2 = r0.iterator();
                                do {
                                    if (it2.hasNext()) {
                                        next = it2.next();
                                        str2 = (String) next;
                                    } else {
                                        next = null;
                                    }
                                    str = (String) next;
                                    if (str != null) {
                                        okbVarM15590q = lkm.m15590q(Integer.valueOf(i3), str);
                                    } else if (i3 != i4) {
                                        i3++;
                                    } else {
                                        okbVarM15590q = null;
                                    }
                                } while (!ook.m18812z(str2, charSequence, i3, str2.length()));
                                str = (String) next;
                                if (str != null) {
                                    okbVarM15590q = lkm.m15590q(Integer.valueOf(i3), str);
                                } else if (i3 != i4) {
                                    i3++;
                                } else {
                                    okbVarM15590q = null;
                                }
                            }
                        }
                    }
                }
                if (okbVarM15590q != null) {
                    return lkm.m15590q(okbVarM15590q.f46186a, Integer.valueOf(((String) okbVarM15590q.f46187b).length()));
                }
                return null;
        }
    }
}
