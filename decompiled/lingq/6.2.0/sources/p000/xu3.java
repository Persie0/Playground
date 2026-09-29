package p000;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.widget.ArrayAdapter;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import com.lingq.core.domain.model.language.DictionaryLocale;
import com.lingq.core.domain.model.user.Profile;
import com.lingq.core.p012ui.R$string;
import com.lingq.feature.imports.UserImportFragment;
import com.lingq.p020ui.HomeFragment;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.bh4;
import p000.fa4;
import p000.lda;
import p000.wfb;

/* JADX INFO: loaded from: classes3.dex */
public final class xu3 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f68785a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractComponentCallbacksC0635c f68786b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f68787c;

    public /* synthetic */ xu3(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c, Object obj, int i) {
        this.f68785a = i;
        this.f68786b = abstractComponentCallbacksC0635c;
        this.f68787c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Integer numValueOf;
        Object value;
        int i2 = this.f68785a;
        Object obj = this.f68787c;
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = this.f68786b;
        switch (i2) {
            case 0:
                final HomeFragment homeFragment = (HomeFragment) abstractComponentCallbacksC0635c;
                String str = ((Profile) obj).f19667p;
                bh4[] bh4VarArr = HomeFragment.f33886N0;
                fr5 fr5Var = new fr5(homeFragment.m2090R(), 0);
                fr5Var.m12027j(abd.m250f(R$string.settings_dictionary_languages, homeFragment));
                fr5Var.m12023f(abd.m250f(R$string.ui_cancel, homeFragment), new uu3(0));
                List list = (List) ((C3244l) homeFragment.m9798k0().f34186u.f9311a).getValue();
                if (list != null) {
                    Iterator it = list.iterator();
                    int i3 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i3 = -1;
                        } else if (!fa4.m11650l(((DictionaryLocale) it.next()).f19021a, str)) {
                            i3++;
                        }
                    }
                    numValueOf = Integer.valueOf(i3);
                } else {
                    numValueOf = null;
                }
                ArrayAdapter arrayAdapter = homeFragment.f33891G0;
                if (arrayAdapter == null) {
                    fa4.m11636J("localesAdapter");
                    throw null;
                }
                int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.lingq.ui.a
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface2, int i4) {
                        DictionaryLocale dictionaryLocale;
                        Object next;
                        String strM17093L;
                        ArrayAdapter arrayAdapter2;
                        bh4[] bh4VarArr2 = HomeFragment.f33886N0;
                        HomeFragment homeFragment2 = homeFragment;
                        List list2 = (List) ((C3244l) homeFragment2.m9798k0().f34186u.f9311a).getValue();
                        if (list2 != null) {
                            Iterator it2 = list2.iterator();
                            do {
                                if (!it2.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it2.next();
                                strM17093L = AbstractC3352my.m17093L(homeFragment2.m2090R(), ((DictionaryLocale) next).f19021a);
                                arrayAdapter2 = homeFragment2.f33891G0;
                                if (arrayAdapter2 == null) {
                                    fa4.m11636J("localesAdapter");
                                    throw null;
                                }
                            } while (!strM17093L.equals(arrayAdapter2.getItem(i4)));
                            dictionaryLocale = (DictionaryLocale) next;
                        } else {
                            dictionaryLocale = null;
                        }
                        if (dictionaryLocale != null) {
                            C2888d c2888dM9798k0 = homeFragment2.m9798k0();
                            String str2 = dictionaryLocale.f19021a;
                            c2888dM9798k0.getClass();
                            str2.getClass();
                            wfb.m23926u(lda.m16103C(c2888dM9798k0), c2888dM9798k0.f34181p, null, new HomeViewModel$updateActiveLocale$1(c2888dM9798k0, str2, null), 2);
                        }
                        dialogInterface2.dismiss();
                    }
                };
                C3681vd c3681vd = fr5Var.f71376a;
                c3681vd.f65220r = arrayAdapter;
                c3681vd.f65221s = onClickListener;
                c3681vd.f65224v = iIntValue + 1;
                c3681vd.f65223u = true;
                fr5Var.m25557a();
                SharedPreferences.Editor editorEdit = homeFragment.m9796i0().f58118b.edit();
                editorEdit.getClass();
                editorEdit.putBoolean("checked_for_dictionary_3", true);
                editorEdit.apply();
                homeFragment.f33892H0 = false;
                return;
            default:
                UserImportFragment userImportFragment = (UserImportFragment) abstractComponentCallbacksC0635c;
                if (userImportFragment.m2115q()) {
                    DialogInterfaceC0016ae dialogInterfaceC0016ae = (DialogInterfaceC0016ae) ((Ref$ObjectRef) obj).f47718a;
                    if (dialogInterfaceC0016ae != null) {
                        dialogInterfaceC0016ae.dismiss();
                    }
                    C3244l c3244l = userImportFragment.m8997R0().f26182n;
                    do {
                        value = c3244l.getValue();
                    } while (!c3244l.m15570h(value, null));
                    b34.m3244j(userImportFragment).m22689f();
                    return;
                }
                return;
        }
    }
}
