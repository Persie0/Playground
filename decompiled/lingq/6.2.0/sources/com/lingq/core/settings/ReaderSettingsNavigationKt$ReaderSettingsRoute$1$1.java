package com.lingq.core.settings;

import com.lingq.core.domain.model.LanguageLearn;
import com.lingq.core.domain.model.theme.ReaderFont;
import com.lingq.core.domain.model.theme.TextHighlightStyle;
import com.lingq.core.domain.store.AudioUnderlineMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3423or;
import p000.aba;
import p000.bq1;
import p000.c18;
import p000.cma;
import p000.cz7;
import p000.dz7;
import p000.e29;
import p000.ez7;
import p000.fz7;
import p000.gm5;
import p000.gz7;
import p000.hz7;
import p000.iz7;
import p000.jz7;
import p000.lda;
import p000.nn1;
import p000.s8d;
import p000.sz7;
import p000.tz7;
import p000.v91;
import p000.vi3;
import p000.vk9;
import p000.vz7;
import p000.wfb;
import p000.xfa;
import p000.xv7;
import p000.y29;
import p000.ys2;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class ReaderSettingsNavigationKt$ReaderSettingsRoute$1$1 extends FunctionReferenceImpl implements vi3 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:144:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0085  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.lingq.core.settings.b, wta] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlinx.coroutines.flow.l] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.vi3
    public final Object invoke(Object obj) {
        Object next;
        ArrayList arrayList;
        Iterator it;
        Object next2;
        e29 e29Var;
        String str;
        int i;
        List listM21155a;
        jz7 jz7Var = (jz7) obj;
        jz7Var.getClass();
        ?? r1 = (C1859b) this.f47704b;
        ?? r2 = r1.f22736r;
        nn1 nn1Var = r1.f22733o;
        C3244l c3244l = r1.f22735q;
        if (jz7Var instanceof iz7) {
            wfb.m23926u(lda.m16103C(r1), nn1Var, null, new ReaderSettingsViewModel$handleAction$1(r1, jz7Var, null), 2);
        } else {
            boolean z = jz7Var instanceof ez7;
            ?? arrayList2 = EmptyList.f47638a;
            if (z) {
                ViewKeys viewKeys = ((ez7) jz7Var).f38110a;
                c18 c18Var = r1.f22738t;
                List list = ((sz7) ((C3244l) c18Var.f9311a).getValue()).f61674a;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof e29) {
                        arrayList3.add(obj2);
                    }
                }
                Iterator it2 = arrayList3.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (((e29) next).f36626c != viewKeys);
                e29 e29Var2 = (e29) next;
                if (e29Var2 != null) {
                    str = e29Var2.f36628e;
                    if (vk9.m23391n0(str)) {
                        str = null;
                    }
                    if (str == null) {
                        List list2 = ((sz7) ((C3244l) c18Var.f9311a).getValue()).f61674a;
                        arrayList = new ArrayList();
                        for (Object obj3 : list2) {
                            if (obj3 instanceof e29) {
                                arrayList.add(obj3);
                            }
                        }
                        it = arrayList.iterator();
                        do {
                            if (it.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it.next();
                        } while (((e29) next2).f36626c != viewKeys);
                        e29Var = (e29) next2;
                        if (e29Var != null) {
                            str = e29Var.f36627d;
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            str = "";
                        }
                    }
                } else {
                    List list3 = ((sz7) ((C3244l) c18Var.f9311a).getValue()).f61674a;
                    arrayList = new ArrayList();
                    while (r0.hasNext()) {
                        if (obj3 instanceof e29) {
                            arrayList.add(obj3);
                        }
                    }
                    it = arrayList.iterator();
                    do {
                        if (it.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                    } while (((e29) next2).f36626c != viewKeys);
                    e29Var = (e29) next2;
                    if (e29Var != null) {
                        str = e29Var.f36627d;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = "";
                    }
                }
                int[] iArr = tz7.f63147a;
                int i2 = iArr[viewKeys.ordinal()];
                if (i2 == 1) {
                    wfb.m23926u(lda.m16103C(r1), nn1Var, null, new ReaderSettingsViewModel$onItemSelected$1(r1, viewKeys, str, null), 2);
                } else if (i2 != 2) {
                    cma cmaVar = r1.f22720b;
                    switch (iArr[viewKeys.ordinal()]) {
                        case 3:
                            ys2<AudioUnderlineMode> entries = AudioUnderlineMode.getEntries();
                            arrayList2 = new ArrayList(v91.m23189q0(entries, 10));
                            for (AudioUnderlineMode audioUnderlineMode : entries) {
                                String strValueOf = String.valueOf(audioUnderlineMode.getValue());
                                int i3 = tz7.f63148b[audioUnderlineMode.ordinal()];
                                if (i3 == 1) {
                                    i = com.lingq.core.p012ui.R$string.settings_audio_underline_none;
                                } else if (i3 == 2) {
                                    i = com.lingq.core.p012ui.R$string.settings_audio_underline_by_sentence;
                                } else {
                                    if (i3 != 3) {
                                        gm5.m12750e();
                                        return null;
                                    }
                                    i = com.lingq.core.p012ui.R$string.settings_audio_underline_real_time;
                                }
                                arrayList2.add(new y29(i, 96, viewKeys, "", strValueOf, false, false, false));
                            }
                            r1.m8614Z2(viewKeys, arrayList2);
                            break;
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            int i4 = vz7.f66141a[viewKeys.ordinal()];
                            if (i4 == 1 || i4 == 2 || i4 == 3 || i4 == 4 || i4 == 5) {
                                String strMo4589b2 = cmaVar.mo4589b2();
                                strMo4589b2.getClass();
                                if (strMo4589b2.equals(LanguageLearn.Japanese.getCode())) {
                                    List listM21155a2 = s8d.m21155a(strMo4589b2);
                                    ArrayList arrayList4 = new ArrayList();
                                    for (Object obj4 : listM21155a2) {
                                        if (!((aba) obj4).f476b.equals("Furigana")) {
                                            arrayList4.add(obj4);
                                        }
                                    }
                                    listM21155a = arrayList4;
                                } else {
                                    listM21155a = s8d.m21155a(strMo4589b2);
                                }
                            } else {
                                listM21155a = s8d.m21155a(cmaVar.mo4589b2());
                            }
                            List<aba> list4 = listM21155a;
                            arrayList2 = new ArrayList(v91.m23189q0(list4, 10));
                            for (aba abaVar : list4) {
                                String str2 = abaVar.f476b;
                                Locale locale = Locale.ROOT;
                                String lowerCase = str2.toLowerCase(locale);
                                lowerCase.getClass();
                                String lowerCase2 = str.toLowerCase(locale);
                                lowerCase2.getClass();
                                arrayList2.add(new y29(abaVar.f475a, 96, viewKeys, "", str2, lowerCase.equals(lowerCase2), false, false));
                            }
                            r1.m8614Z2(viewKeys, arrayList2);
                            break;
                        case 14:
                            ys2<TextHighlightStyle> entries2 = TextHighlightStyle.getEntries();
                            arrayList2 = new ArrayList(v91.m23189q0(entries2, 10));
                            for (TextHighlightStyle textHighlightStyle : entries2) {
                                String strName = textHighlightStyle.name();
                                String strName2 = textHighlightStyle.name();
                                Locale locale2 = Locale.ROOT;
                                String lowerCase3 = strName2.toLowerCase(locale2);
                                lowerCase3.getClass();
                                String lowerCase4 = str.toLowerCase(locale2);
                                lowerCase4.getClass();
                                arrayList2.add(new y29(AbstractC3423or.m18261j0(textHighlightStyle), 96, viewKeys, "", strName, lowerCase3.equals(lowerCase4), false, false));
                            }
                            r1.m8614Z2(viewKeys, arrayList2);
                            break;
                        case 15:
                            xv7 xv7Var = ReaderFont.Companion;
                            String strMo4589b3 = cmaVar.mo4589b2();
                            xv7Var.getClass();
                            ArrayList<ReaderFont> arrayListM24712c = xv7.m24712c(strMo4589b3);
                            arrayList2 = new ArrayList(v91.m23189q0(arrayListM24712c, 10));
                            for (ReaderFont readerFont : arrayListM24712c) {
                                arrayList2.add(new y29(0, 112, viewKeys, readerFont.getTitle(), bq1.m4057h0(readerFont), bq1.m4057h0(readerFont).equals(str), false, false));
                            }
                            r1.m8614Z2(viewKeys, arrayList2);
                            break;
                        default:
                            r1.m8614Z2(viewKeys, arrayList2);
                            break;
                    }
                } else {
                    wfb.m23926u(lda.m16103C(r1), nn1Var, null, new ReaderSettingsViewModel$onItemSelected$2(r1, viewKeys, null), 2);
                }
            } else if (jz7Var instanceof dz7) {
                wfb.m23926u(lda.m16103C(r1), nn1Var, null, new ReaderSettingsViewModel$handleAction$2(r1, jz7Var, null), 2);
            } else if (jz7Var instanceof fz7) {
                wfb.m23926u(lda.m16103C(r1), nn1Var, null, new ReaderSettingsViewModel$handleAction$3(r1, jz7Var, null), 2);
            } else if (jz7Var instanceof gz7) {
                wfb.m23926u(lda.m16103C(r1), nn1Var, null, new ReaderSettingsViewModel$handleAction$4(r1, jz7Var, null), 2);
            } else if (jz7Var instanceof hz7) {
                hz7 hz7Var = (hz7) jz7Var;
                ViewKeys viewKeys2 = hz7Var.f43243a;
                String str3 = hz7Var.f43244b;
                int i5 = tz7.f63147a[viewKeys2.ordinal()];
                if (i5 == 1) {
                    wfb.m23926u(lda.m16103C(r1), nn1Var, null, new ReaderSettingsViewModel$onSelectionItemSelected$2(r1, str3, null), 2);
                } else if (i5 != 16) {
                    c3244l.m15571i(null);
                    r2.getClass();
                    r2.m15572j(null, arrayList2);
                    wfb.m23926u(lda.m16103C(r1), nn1Var, null, new ReaderSettingsViewModel$onSelectionItemSelected$3(r1, viewKeys2, str3, null), 2);
                } else {
                    wfb.m23926u(lda.m16103C(r1), nn1Var, null, new ReaderSettingsViewModel$onSelectionItemSelected$1(r1, null), 2);
                }
            } else {
                if (!(jz7Var instanceof cz7)) {
                    gm5.m12750e();
                    return null;
                }
                c3244l.m15571i(null);
                r2.getClass();
                r2.m15572j(null, arrayList2);
            }
        }
        return xfa.f68157a;
    }
}
