package p000;

import android.content.Context;
import com.lingq.core.domain.model.status.CardStatus;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class xya implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f68974a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f68975b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ w19 f68976c;

    public xya(w19 w19Var, Context context) {
        this.f68976c = w19Var;
        this.f68975b = context;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        CardStatus cardStatus;
        CardStatus cardStatus2;
        String string;
        CardStatus cardStatus3;
        CardStatus cardStatus4;
        int i = this.f68974a;
        xfa xfaVar = xfa.f68157a;
        w19 w19Var = this.f68976c;
        Context context = this.f68975b;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Number) obj2).intValue();
                float f = w19Var.f66229d;
                float f2 = w19Var.f66228c;
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(1 & iIntValue, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                    return xfaVar;
                }
                if (f == f2) {
                    Iterator<E> it = CardStatus.getEntries().iterator();
                    do {
                        if (!it.hasNext()) {
                            uk9.m22775i("Collection contains no element matching the predicate.");
                            return null;
                        }
                        cardStatus3 = (CardStatus) it.next();
                    } while (cardStatus3.getValue() != ((int) f2));
                    string = context.getString(AbstractC3423or.m18225J(cardStatus3));
                    String str = string;
                    str.getClass();
                    lw9.m16554b(str, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var, 0, 0, 262142);
                    return xfaVar;
                }
                Locale locale = Locale.getDefault();
                Iterator<E> it2 = CardStatus.getEntries().iterator();
                do {
                    if (it2.hasNext()) {
                        cardStatus = (CardStatus) it2.next();
                    } else {
                        uk9.m22775i("Collection contains no element matching the predicate.");
                    }
                    return null;
                } while (cardStatus.getValue() != ((int) f2));
                String string2 = context.getString(AbstractC3423or.m18225J(cardStatus));
                Iterator<E> it3 = CardStatus.getEntries().iterator();
                do {
                    if (!it3.hasNext()) {
                        uk9.m22775i("Collection contains no element matching the predicate.");
                        return null;
                    }
                    cardStatus2 = (CardStatus) it3.next();
                } while (cardStatus2.getValue() != ((int) f));
                string = String.format(locale, "%s - %s", Arrays.copyOf(new Object[]{string2, context.getString(AbstractC3423or.m18225J(cardStatus2))}, 2));
                String str2 = string;
                str2.getClass();
                lw9.m16554b(str2, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var, 0, 0, 262142);
                return xfaVar;
            default:
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    tj3Var2.m22102U();
                    return xfaVar;
                }
                int i2 = (int) w19Var.f66228c;
                int i3 = (int) w19Var.f66229d;
                for (CardStatus cardStatus5 : CardStatus.getEntries()) {
                    if (cardStatus5.getValue() == i2) {
                        String string3 = context.getString(AbstractC3423or.m18225J(cardStatus5));
                        string3.getClass();
                        if (i2 != i3) {
                            Iterator<E> it4 = CardStatus.getEntries().iterator();
                            do {
                                if (!it4.hasNext()) {
                                    uk9.m22775i("Collection contains no element matching the predicate.");
                                    return null;
                                }
                                cardStatus4 = (CardStatus) it4.next();
                            } while (cardStatus4.getValue() != i3);
                            String string4 = context.getString(AbstractC3423or.m18225J(cardStatus4));
                            string4.getClass();
                            string3 = String.format(Locale.getDefault(), "%s - %s", Arrays.copyOf(new Object[]{string3, string4}, 2));
                        }
                        lw9.m16554b(string3, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var2, 0, 0, 262142);
                        return xfaVar;
                    }
                }
                uk9.m22775i("Collection contains no element matching the predicate.");
                return null;
        }
    }

    public xya(Context context, w19 w19Var) {
        this.f68975b = context;
        this.f68976c = w19Var;
    }
}
