package p000;

import android.widget.Toast;
import androidx.compose.animation.core.C0059a;
import com.lingq.core.domain.model.library.LibraryItem;
import com.lingq.core.domain.model.library.LibraryItemCounter;
import com.lingq.core.p012ui.R$drawable;
import com.lingq.core.p012ui.R$string;
import com.lingq.core.settings.C1859b;
import com.lingq.core.settings.ViewKeys;
import com.lingq.feature.challenges.ChallengesFragment;
import com.lingq.feature.challenges.bookchallenge.BookChallengeChooserParentFragment;
import com.lingq.feature.collections.C2034d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: loaded from: classes2.dex */
public final class ye0 implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f69704a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f69705b;

    public /* synthetic */ ye0(Object obj, int i) {
        this.f69704a = i;
        this.f69705b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.e83
    public final Object emit(Object obj, Continuation continuation) {
        Object value;
        Object value2;
        t61 t61Var;
        boolean z;
        h81 h81Var;
        h81 h81Var2;
        Object next;
        Float f;
        int i = this.f69704a;
        t61 t61Var2 = null;
        xfa xfaVar = xfa.f68157a;
        Object obj2 = this.f69705b;
        switch (i) {
            case 0:
                df0 df0Var = (df0) obj;
                BookChallengeChooserParentFragment bookChallengeChooserParentFragment = (BookChallengeChooserParentFragment) obj2;
                String str = df0Var.f35542g;
                if (str != null) {
                    Toast.makeText(bookChallengeChooserParentFragment.m2090R(), str, 1).show();
                    C3244l c3244l = bookChallengeChooserParentFragment.m8811A0().f24549i;
                    do {
                        value = c3244l.getValue();
                    } while (!c3244l.m15570h(value, df0.m10318a((df0) value, null, null, null, null, null, false, null, 0, 959)));
                }
                int i2 = df0Var.f35543h;
                if (i2 > bookChallengeChooserParentFragment.f24512T0) {
                    bookChallengeChooserParentFragment.f24512T0 = i2;
                    bookChallengeChooserParentFragment.mo3657c0();
                }
                return xfaVar;
            case 1:
                Object objM747f = ((C0059a) obj2).m747f(new Float(e70.f36790a.mo12780a(((u60) obj).f63472c)), continuation);
                return objM747f == CoroutineSingletons.COROUTINE_SUSPENDED ? objM747f : xfaVar;
            case 2:
                ChallengesFragment challengesFragment = (ChallengesFragment) obj2;
                if (((Boolean) obj).booleanValue()) {
                    bh4[] bh4VarArr = ChallengesFragment.f24437G0;
                    C3244l c3244l2 = challengesFragment.m8807R0().f24698i;
                    do {
                        value2 = c3244l2.getValue();
                        ((Boolean) value2).getClass();
                    } while (!c3244l2.m15570h(value2, Boolean.FALSE));
                    w41 w41Var = challengesFragment.f24441F0;
                    if (w41Var == null) {
                        fa4.m11636J("navGraphController");
                        throw null;
                    }
                    w41Var.m23737z(new u96(false));
                }
                return xfaVar;
            case 3:
                c61 c61Var = (c61) obj;
                C2034d c2034d = (C2034d) obj2;
                C3244l c3244l3 = c2034d.f25555N;
                while (true) {
                    Object value3 = c3244l3.getValue();
                    q91 q91Var = (q91) value3;
                    c61Var.getClass();
                    boolean z2 = c61Var.f9616k;
                    boolean z3 = c61Var.f9615j;
                    List list = c61Var.f9608c;
                    ArrayList arrayList = new ArrayList();
                    LibraryItem libraryItem = c61Var.f9606a;
                    LibraryItemCounter libraryItemCounter = c61Var.f9607b;
                    if (z3 && (libraryItem == null || libraryItemCounter == null)) {
                        arrayList.add(h71.f41856a);
                    }
                    if (libraryItem == null || libraryItemCounter == null) {
                        t61Var = t61Var2;
                    } else {
                        t61Var = t61Var2;
                        arrayList.add(new g71(new d71(libraryItem, libraryItemCounter)));
                        boolean z4 = c61Var.f9610e;
                        boolean z5 = c61Var.f9611f;
                        boolean z6 = c61Var.f9612g;
                        boolean z7 = c61Var.f9613h;
                        boolean z8 = c61Var.f9614i;
                        String str2 = c2034d.f25568a0;
                        C3244l c3244l4 = c2034d.f25559R;
                        List list2 = ((c61) c3244l4.getValue()).f9608c;
                        if (list2.isEmpty()) {
                            z = z5;
                            h81Var2 = t61Var;
                        } else {
                            LibraryItemCounter libraryItemCounter2 = ((c61) c3244l4.getValue()).f9607b;
                            if (libraryItemCounter2 != null) {
                                z = z5;
                                if (libraryItemCounter2.f19460f) {
                                    Iterator it = list2.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            next = it.next();
                                            Iterator it2 = it;
                                            LibraryItemCounter libraryItemCounter3 = ((h81) next).f41931b;
                                            if (((libraryItemCounter3 == null || (f = libraryItemCounter3.f19457c) == null) ? 0.0f : f.floatValue()) >= 100.0f) {
                                                it = it2;
                                            }
                                        } else {
                                            next = t61Var;
                                        }
                                    }
                                    h81Var = (h81) next;
                                    if (h81Var == null) {
                                        h81Var = (h81) u91.m22598P0(list2);
                                    }
                                }
                                h81Var2 = h81Var;
                            } else {
                                z = z5;
                            }
                            h81Var = (h81) u91.m22591I0(list2);
                            h81Var2 = h81Var;
                        }
                        arrayList.add(new i71(new f71(libraryItem, libraryItemCounter, z4, z, z6, z7, z8, str2, h81Var2, C2034d.m8940V2(libraryItem, c61Var.f9622q), c61Var.f9621p)));
                    }
                    if (!list.isEmpty()) {
                        arrayList.add(new m71(new p91(c61Var.f9609d)));
                        List list3 = list;
                        ArrayList arrayList2 = new ArrayList(v91.m23189q0(list3, 10));
                        Iterator it3 = list3.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(new k71((h81) it3.next()));
                        }
                        arrayList.addAll(arrayList2);
                    } else if (z2 != 0) {
                        ArrayList arrayList3 = new ArrayList(3);
                        for (int i3 = 0; i3 < 3; i3++) {
                            arrayList3.add(new l71(i3));
                        }
                        arrayList.addAll(arrayList3);
                    }
                    if (c61Var.f9617l) {
                        arrayList.add(j71.f45134a);
                    }
                    if (c3244l3.m15570h(value3, q91.m19806a(q91Var, arrayList, z3 || z2, q91Var.f57442d != null ? c2034d.m8942W2(c2034d.f25554M.f8038c, c61Var) : t61Var, null, null, false, false, 241))) {
                        return xfaVar;
                    }
                    t61Var2 = t61Var;
                }
                break;
            case 4:
                Object objMo4678m = ((kl7) ((ll7) obj2)).f47495f.mo4678m(obj, continuation);
                return objMo4678m == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo4678m : xfaVar;
            default:
                Pair pair = (Pair) obj;
                List<String> list4 = (List) pair.f47624b;
                C3244l c3244l5 = ((C1859b) obj2).f22734p;
                ListBuilder listBuilderM23650t = vz1.m23650t();
                listBuilderM23650t.add(new o19(R$string.settings_dictionary_languages));
                for (String str3 : list4) {
                    listBuilderM23650t.add(new b29(C1859b.m8613Y2(str3), str3, R$drawable.ic_trash, ViewKeys.DictionaryLocale));
                }
                listBuilderM23650t.add(new x19(Integer.valueOf(com.lingq.core.settings.R$string.settings_add_dictionary_language), null, ViewKeys.AddDictionaryLanguage, 2));
                c3244l5.m15571i(vz1.m23635i(listBuilderM23650t));
                return xfaVar;
        }
    }
}
