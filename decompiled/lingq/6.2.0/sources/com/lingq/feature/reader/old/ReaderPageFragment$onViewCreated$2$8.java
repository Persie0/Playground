package com.lingq.feature.reader.old;

import com.lingq.core.domain.model.token.TextTokenType;
import com.lingq.core.domain.model.token.TokenRelatedPhrase;
import com.lingq.core.domain.model.token.TokenTransliteration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3393o1;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.fa4;
import p000.iy7;
import p000.je9;
import p000.ox7;
import p000.un1;
import p000.vk9;
import p000.vx7;
import p000.vz1;
import p000.xfa;
import p000.xz7;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$8", m4291f = "ReaderPageFragment.kt", m4292l = {509}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderPageFragment$onViewCreated$2$8 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28578a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderPageFragment f28579b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$8$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$2$8$1", m4291f = "ReaderPageFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23551 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f28580a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReaderPageFragment f28581b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23551(ReaderPageFragment readerPageFragment, Continuation continuation) {
            super(2, continuation);
            this.f28581b = readerPageFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C23551 c23551 = new C23551(this.f28581b, continuation);
            c23551.f28580a = obj;
            return c23551;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C23551 c23551 = (C23551) create((Pair) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23551.invokeSuspend(xfaVar);
            return xfaVar;
        }

        /* JADX WARN: Code duplicated, block: B:100:0x0134 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:101:0x0124 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:102:0x0136 A[EDGE_INSN: B:102:0x0136->B:59:0x0136 BREAK  A[LOOP:3: B:42:0x0107->B:103:0x0107], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:106:0x015a A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:109:0x014a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:16:0x0067  */
        /* JADX WARN: Code duplicated, block: B:17:0x006a  */
        /* JADX WARN: Code duplicated, block: B:19:0x006d  */
        /* JADX WARN: Code duplicated, block: B:22:0x008f  */
        /* JADX WARN: Code duplicated, block: B:25:0x009f  */
        /* JADX WARN: Code duplicated, block: B:27:0x00a9  */
        /* JADX WARN: Code duplicated, block: B:29:0x00b7  */
        /* JADX WARN: Code duplicated, block: B:31:0x00d4  */
        /* JADX WARN: Code duplicated, block: B:32:0x00d7  */
        /* JADX WARN: Code duplicated, block: B:35:0x00dc  */
        /* JADX WARN: Code duplicated, block: B:37:0x00eb  */
        /* JADX WARN: Code duplicated, block: B:41:0x00fa  */
        /* JADX WARN: Code duplicated, block: B:43:0x0109 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:44:0x010b  */
        /* JADX WARN: Code duplicated, block: B:45:0x010d  */
        /* JADX WARN: Code duplicated, block: B:48:0x011c  */
        /* JADX WARN: Code duplicated, block: B:49:0x011f  */
        /* JADX WARN: Code duplicated, block: B:51:0x0122 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:57:0x0131  */
        /* JADX WARN: Code duplicated, block: B:61:0x0146  */
        /* JADX WARN: Code duplicated, block: B:64:0x0150  */
        /* JADX WARN: Code duplicated, block: B:74:0x01c9  */
        /* JADX WARN: Code duplicated, block: B:94:0x005c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:95:0x01e6 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:98:0x012e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:99:0x0129 A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            xz7 xz7Var;
            int i;
            int i2;
            List listM23365A0;
            ArrayList<xz7> arrayList;
            StringBuilder sb;
            ox7 ox7Var;
            List list;
            Iterator it;
            int i3;
            Object next;
            int i4;
            List list2;
            xz7 xz7Var2;
            ReaderPageFragment readerPageFragment;
            boolean z;
            int i5;
            boolean z2;
            String string;
            int length;
            int i6;
            int i7;
            int i8;
            int i9;
            Object value;
            int i10;
            int i11;
            Object value2;
            xz7 xz7Var3;
            Pair pair = (Pair) this.f28580a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            TokenRelatedPhrase tokenRelatedPhrase = (TokenRelatedPhrase) pair.f47623a;
            boolean zBooleanValue = ((Boolean) pair.f47624b).booleanValue();
            vx7 vx7Var = ReaderPageFragment.Companion;
            ReaderPageFragment readerPageFragment2 = this.f28581b;
            C2411m c2411mM9299X0 = readerPageFragment2.m9299X0();
            String str = tokenRelatedPhrase.f19613b;
            Locale locale = c2411mM9299X0.f29253u;
            C3244l c3244l = c2411mM9299X0.f29212Q;
            str.getClass();
            if (zBooleanValue && (xz7Var3 = c2411mM9299X0.f29251s) != null) {
                Iterator it2 = ((List) ((C3244l) c2411mM9299X0.f29199D.f9311a).getValue()).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        iy7 iy7Var = (iy7) it2.next();
                        if (iy7Var.f44781c.get(xz7Var3.f69008e) == null || !c2411mM9299X0.m9306a3(iy7Var.f44779a, xz7Var3)) {
                        }
                    } else {
                        xz7Var = c2411mM9299X0.f29251s;
                        if (xz7Var != null) {
                            i = xz7Var.f69004a;
                        } else {
                            i = -1;
                        }
                        if (xz7Var != null) {
                        }
                        i2 = 0;
                        listM23365A0 = vk9.m23365A0(str, new String[]{" "}, 0, 6);
                        arrayList = new ArrayList();
                        sb = new StringBuilder();
                        ox7Var = (ox7) c2411mM9299X0.f29254v.getValue();
                        if (ox7Var == null) {
                            list = ox7Var.f55132e;
                            it = list.iterator();
                            i3 = 0;
                            loop2: while (true) {
                                if (!it.hasNext()) {
                                    next = it.next();
                                    i4 = i3 + 1;
                                    list2 = list;
                                    if (i3 >= 0) {
                                        vz1.m23628e0();
                                        throw null;
                                    }
                                    xz7Var2 = (xz7) next;
                                    readerPageFragment = readerPageFragment2;
                                    z = zBooleanValue;
                                    if (i2 < listM23365A0.size()) {
                                        String str2 = xz7Var2.f69008e;
                                        locale.getClass();
                                        i5 = 1;
                                        if (vz1.m23610P(str2, locale).equals(vz1.m23610P((String) listM23365A0.get(i2), locale))) {
                                        }
                                        if (z2) {
                                            arrayList.add(xz7Var2);
                                            sb.append(xz7Var2.f69008e);
                                            sb.append(" ");
                                            i2++;
                                        }
                                        if (z2) {
                                            string = sb.toString();
                                            length = string.length() - 1;
                                            i6 = 0;
                                            i7 = 0;
                                            while (true) {
                                                if (i6 > length) {
                                                    locale = locale;
                                                    break;
                                                }
                                                if (i7 == 0) {
                                                    i10 = i6;
                                                } else {
                                                    i10 = length;
                                                }
                                                locale = locale;
                                                if (fa4.m11651m(string.charAt(i10), 32) <= 0) {
                                                    i11 = i5;
                                                } else {
                                                    i11 = 0;
                                                }
                                                if (i7 != 0) {
                                                    if (i11 == 0) {
                                                        break;
                                                        break;
                                                    }
                                                    length--;
                                                } else if (i11 == 0) {
                                                    i7 = i5;
                                                } else {
                                                    i6++;
                                                }
                                            }
                                            if (fa4.m11650l(string.subSequence(i6, length + 1).toString(), str)) {
                                                for (xz7 xz7Var4 : arrayList) {
                                                    if (xz7Var4.f69004a != i) {
                                                    }
                                                }
                                                i8 = 0;
                                                sb.delete(0, sb.length());
                                                arrayList.clear();
                                            } else {
                                                i8 = 0;
                                                sb.delete(0, sb.length());
                                                arrayList.clear();
                                            }
                                            i9 = i8;
                                        } else {
                                            string = sb.toString();
                                            length = string.length() - 1;
                                            i6 = 0;
                                            i7 = 0;
                                            while (true) {
                                                if (i6 > length) {
                                                    locale = locale;
                                                    break;
                                                }
                                                if (i7 == 0) {
                                                    i10 = i6;
                                                } else {
                                                    i10 = length;
                                                }
                                                locale = locale;
                                                if (fa4.m11651m(string.charAt(i10), 32) <= 0) {
                                                    i11 = i5;
                                                } else {
                                                    i11 = 0;
                                                }
                                                if (i7 != 0) {
                                                    if (i11 == 0) {
                                                        break;
                                                        break;
                                                    }
                                                    length--;
                                                } else if (i11 == 0) {
                                                    i7 = i5;
                                                } else {
                                                    i6++;
                                                }
                                            }
                                            if (fa4.m11650l(string.subSequence(i6, length + 1).toString(), str)) {
                                                while (r0.hasNext()) {
                                                    if (xz7Var4.f69004a != i) {
                                                    }
                                                }
                                                i8 = 0;
                                                sb.delete(0, sb.length());
                                                arrayList.clear();
                                            } else {
                                                i8 = 0;
                                                sb.delete(0, sb.length());
                                                arrayList.clear();
                                            }
                                            i9 = i8;
                                        }
                                        c3244l = c3244l;
                                        str = str;
                                        locale = locale;
                                        i3 = i4;
                                        list = list2;
                                        zBooleanValue = z;
                                        i2 = i9;
                                        readerPageFragment2 = readerPageFragment;
                                    } else {
                                        i5 = 1;
                                    }
                                    if (z2) {
                                        arrayList.add(xz7Var2);
                                        sb.append(xz7Var2.f69008e);
                                        sb.append(" ");
                                        i2++;
                                    }
                                    if (z2) {
                                        string = sb.toString();
                                        length = string.length() - 1;
                                        i6 = 0;
                                        i7 = 0;
                                        while (true) {
                                            if (i6 > length) {
                                                locale = locale;
                                                break;
                                            }
                                            if (i7 == 0) {
                                                i10 = i6;
                                            } else {
                                                i10 = length;
                                            }
                                            locale = locale;
                                            if (fa4.m11651m(string.charAt(i10), 32) <= 0) {
                                                i11 = i5;
                                            } else {
                                                i11 = 0;
                                            }
                                            if (i7 != 0) {
                                                if (i11 == 0) {
                                                    break;
                                                    break;
                                                }
                                                length--;
                                            } else if (i11 == 0) {
                                                i7 = i5;
                                            } else {
                                                i6++;
                                            }
                                        }
                                        if (fa4.m11650l(string.subSequence(i6, length + 1).toString(), str)) {
                                            while (r0.hasNext()) {
                                                if (xz7Var4.f69004a != i) {
                                                }
                                            }
                                            i8 = 0;
                                            sb.delete(0, sb.length());
                                            arrayList.clear();
                                        } else {
                                            i8 = 0;
                                            sb.delete(0, sb.length());
                                            arrayList.clear();
                                        }
                                        i9 = i8;
                                    } else {
                                        string = sb.toString();
                                        length = string.length() - 1;
                                        i6 = 0;
                                        i7 = 0;
                                        while (true) {
                                            if (i6 > length) {
                                                locale = locale;
                                                break;
                                            }
                                            if (i7 == 0) {
                                                i10 = i6;
                                            } else {
                                                i10 = length;
                                            }
                                            locale = locale;
                                            if (fa4.m11651m(string.charAt(i10), 32) <= 0) {
                                                i11 = i5;
                                            } else {
                                                i11 = 0;
                                            }
                                            if (i7 != 0) {
                                                if (i11 == 0) {
                                                    break;
                                                    break;
                                                }
                                                length--;
                                            } else if (i11 == 0) {
                                                i7 = i5;
                                            } else {
                                                i6++;
                                            }
                                        }
                                        if (fa4.m11650l(string.subSequence(i6, length + 1).toString(), str)) {
                                            while (r0.hasNext()) {
                                                if (xz7Var4.f69004a != i) {
                                                }
                                            }
                                            i8 = 0;
                                            sb.delete(0, sb.length());
                                            arrayList.clear();
                                        } else {
                                            i8 = 0;
                                            sb.delete(0, sb.length());
                                            arrayList.clear();
                                        }
                                        i9 = i8;
                                    }
                                    c3244l = c3244l;
                                    str = str;
                                    locale = locale;
                                    i3 = i4;
                                    list = list2;
                                    zBooleanValue = z;
                                    i2 = i9;
                                    readerPageFragment2 = readerPageFragment;
                                }
                            }
                        }
                    }
                    readerPageFragment = readerPageFragment2;
                    z = zBooleanValue;
                    break;
                }
            }
            xz7Var = c2411mM9299X0.f29251s;
            if (xz7Var != null) {
                i = xz7Var.f69004a;
            } else {
                i = -1;
            }
            int i12 = xz7Var != null ? xz7Var.f69005b : -1;
            i2 = 0;
            listM23365A0 = vk9.m23365A0(str, new String[]{" "}, 0, 6);
            arrayList = new ArrayList();
            sb = new StringBuilder();
            ox7Var = (ox7) c2411mM9299X0.f29254v.getValue();
            if (ox7Var == null) {
                readerPageFragment = readerPageFragment2;
                z = zBooleanValue;
                break;
            }
            list = ox7Var.f55132e;
            it = list.iterator();
            i3 = 0;
            loop2: while (true) {
                if (!it.hasNext()) {
                    readerPageFragment = readerPageFragment2;
                    z = zBooleanValue;
                    break;
                }
                next = it.next();
                i4 = i3 + 1;
                list2 = list;
                if (i3 >= 0) {
                    vz1.m23628e0();
                    throw null;
                }
                xz7Var2 = (xz7) next;
                readerPageFragment = readerPageFragment2;
                z = zBooleanValue;
                if (i2 < listM23365A0.size()) {
                    String str3 = xz7Var2.f69008e;
                    locale.getClass();
                    i5 = 1;
                    z2 = vz1.m23610P(str3, locale).equals(vz1.m23610P((String) listM23365A0.get(i2), locale));
                    if (z2) {
                        arrayList.add(xz7Var2);
                        sb.append(xz7Var2.f69008e);
                        sb.append(" ");
                        i2++;
                    }
                    if (z2 || i3 == list2.size()) {
                        string = sb.toString();
                        length = string.length() - 1;
                        i6 = 0;
                        i7 = 0;
                        while (true) {
                            if (i6 > length) {
                                locale = locale;
                                break;
                            }
                            if (i7 == 0) {
                                i10 = i6;
                            } else {
                                i10 = length;
                            }
                            locale = locale;
                            if (fa4.m11651m(string.charAt(i10), 32) <= 0) {
                                i11 = i5;
                            } else {
                                i11 = 0;
                            }
                            if (i7 != 0) {
                                if (i11 == 0) {
                                    break;
                                }
                                length--;
                            } else if (i11 == 0) {
                                i7 = i5;
                            } else {
                                i6++;
                            }
                        }
                        if (fa4.m11650l(string.subSequence(i6, length + 1).toString(), str)) {
                            while (r0.hasNext()) {
                                if (xz7Var4.f69004a != i && xz7Var4.f69005b == i12) {
                                    C3244l c3244l2 = c3244l;
                                    xz7 xz7Var5 = new xz7(((xz7) arrayList.get(0)).f69004a, ((xz7) AbstractC3393o1.m17731f(i5, arrayList)).f69005b, 0, 0, str, ((xz7) arrayList.get(0)).f69009f, 0, 0, (String) null, (TokenTransliteration) null, TextTokenType.POTENTIAL_PHRASE, 0, (Map) null, (String) null, (String) null, (String) null, 261068);
                                    c3244l2.m15571i(null);
                                    C3244l c3244l3 = c2411mM9299X0.f29211P;
                                    do {
                                        value = c3244l3.getValue();
                                    } while (!c3244l3.m15570h(value, c2411mM9299X0.f29251s));
                                    c2411mM9299X0.f29209N.m15571i(null);
                                    je9 je9VarM9309d3 = c2411mM9299X0.m9309d3(xz7Var5);
                                    c3244l2.getClass();
                                    c3244l2.m15572j(null, je9VarM9309d3);
                                    break loop2;
                                }
                            }
                            i8 = 0;
                            sb.delete(0, sb.length());
                            arrayList.clear();
                        } else {
                            i8 = 0;
                            sb.delete(0, sb.length());
                            arrayList.clear();
                        }
                        i9 = i8;
                    } else {
                        locale = locale;
                        c3244l = c3244l;
                        i9 = i2;
                        str = str;
                    }
                    c3244l = c3244l;
                    str = str;
                    locale = locale;
                    i3 = i4;
                    list = list2;
                    zBooleanValue = z;
                    i2 = i9;
                    readerPageFragment2 = readerPageFragment;
                } else {
                    i5 = 1;
                }
                if (z2) {
                    arrayList.add(xz7Var2);
                    sb.append(xz7Var2.f69008e);
                    sb.append(" ");
                    i2++;
                }
                if (z2) {
                    string = sb.toString();
                    length = string.length() - 1;
                    i6 = 0;
                    i7 = 0;
                    while (true) {
                        if (i6 > length) {
                            locale = locale;
                            break;
                        }
                        if (i7 == 0) {
                            i10 = i6;
                        } else {
                            i10 = length;
                        }
                        locale = locale;
                        if (fa4.m11651m(string.charAt(i10), 32) <= 0) {
                            i11 = i5;
                        } else {
                            i11 = 0;
                        }
                        if (i7 != 0) {
                            if (i11 == 0) {
                                break;
                                break;
                            }
                            length--;
                        } else if (i11 == 0) {
                            i7 = i5;
                        } else {
                            i6++;
                        }
                    }
                    if (fa4.m11650l(string.subSequence(i6, length + 1).toString(), str)) {
                        while (r0.hasNext()) {
                            if (xz7Var4.f69004a != i) {
                            }
                        }
                        i8 = 0;
                        sb.delete(0, sb.length());
                        arrayList.clear();
                    } else {
                        i8 = 0;
                        sb.delete(0, sb.length());
                        arrayList.clear();
                    }
                    i9 = i8;
                } else {
                    string = sb.toString();
                    length = string.length() - 1;
                    i6 = 0;
                    i7 = 0;
                    while (true) {
                        if (i6 > length) {
                            locale = locale;
                            break;
                        }
                        if (i7 == 0) {
                            i10 = i6;
                        } else {
                            i10 = length;
                        }
                        locale = locale;
                        if (fa4.m11651m(string.charAt(i10), 32) <= 0) {
                            i11 = i5;
                        } else {
                            i11 = 0;
                        }
                        if (i7 != 0) {
                            if (i11 == 0) {
                                break;
                                break;
                            }
                            length--;
                        } else if (i11 == 0) {
                            i7 = i5;
                        } else {
                            i6++;
                        }
                    }
                    if (fa4.m11650l(string.subSequence(i6, length + 1).toString(), str)) {
                        while (r0.hasNext()) {
                            if (xz7Var4.f69004a != i) {
                            }
                        }
                        i8 = 0;
                        sb.delete(0, sb.length());
                        arrayList.clear();
                    } else {
                        i8 = 0;
                        sb.delete(0, sb.length());
                        arrayList.clear();
                    }
                    i9 = i8;
                }
                c3244l = c3244l;
                str = str;
                locale = locale;
                i3 = i4;
                list = list2;
                zBooleanValue = z;
                i2 = i9;
                readerPageFragment2 = readerPageFragment;
            }
            if (z) {
                C2411m c2411mM9299X1 = readerPageFragment.m9299X0();
                C3244l c3244l4 = c2411mM9299X1.f29209N;
                if (c3244l4.getValue() == null) {
                    do {
                        value2 = c3244l4.getValue();
                    } while (!c3244l4.m15570h(value2, (xz7) c2411mM9299X1.f29211P.getValue()));
                }
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderPageFragment$onViewCreated$2$8(ReaderPageFragment readerPageFragment, Continuation continuation) {
        super(2, continuation);
        this.f28579b = readerPageFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderPageFragment$onViewCreated$2$8(this.f28579b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderPageFragment$onViewCreated$2$8) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28578a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            vx7 vx7Var = ReaderPageFragment.Companion;
            ReaderPageFragment readerPageFragment = this.f28579b;
            c83 c83VarMo8748W = readerPageFragment.m9298W0().f29344c.mo8748W();
            C23551 c23551 = new C23551(readerPageFragment, null);
            this.f28578a = 1;
            if (AbstractC3224d.m15529h(c83VarMo8748W, c23551, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
