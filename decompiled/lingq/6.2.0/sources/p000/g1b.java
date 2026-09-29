package p000;

import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.layout.adapter.extensions.C0770a;
import androidx.work.impl.WorkDatabase_Impl;
import com.lingq.core.domain.model.status.CardStatus;
import com.lingq.core.domain.model.vocabulary.C1514a;
import com.lingq.core.domain.model.vocabulary.VocabularySearchQuery;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g1b implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f40055a;

    public /* synthetic */ g1b(WorkDatabase_Impl workDatabase_Impl) {
        this.f40055a = 3;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        WindowLayoutComponent windowLayoutComponentM22189a;
        Object c0770a;
        switch (this.f40055a) {
            case 0:
                C1514a c1514a = VocabularySearchQuery.Companion;
                CardStatus[] cardStatusArrValues = CardStatus.values();
                cardStatusArrValues.getClass();
                return new C2978ev(new zs2("com.lingq.core.domain.model.status.CardStatus", cardStatusArrValues));
            case 1:
                if (nj0.f52798Q == null) {
                    C3386nv.m17633t("You have to initialize apiKey before use");
                    return null;
                }
                try {
                    String strM17453p = nj0.m17453p(nj0.m17449j("api/user/identify", null));
                    if (strM17453p != null) {
                        return qba.m19851c(new JSONObject(strM17453p));
                    }
                    return null;
                } catch (Exception e) {
                    System.out.println((Object) ("Failed to identify user: " + e.getLocalizedMessage()));
                    return null;
                }
            case 2:
                try {
                    ClassLoader classLoader = d5b.class.getClassLoader();
                    tk8 tk8Var = classLoader != null ? new tk8(classLoader, new qn3(classLoader)) : null;
                    if (tk8Var == null || (windowLayoutComponentM22189a = tk8Var.m22189a()) == null) {
                        return null;
                    }
                    qn3 qn3Var = new qn3(classLoader);
                    int iM9933a = cy2.m9933a();
                    if (iM9933a >= 9) {
                        c0770a = new by2(windowLayoutComponentM22189a, qn3Var);
                    } else if (iM9933a >= 6) {
                        c0770a = new ay2(windowLayoutComponentM22189a, qn3Var);
                    } else if (iM9933a >= 2) {
                        c0770a = new zx2(windowLayoutComponentM22189a, qn3Var);
                    } else {
                        c0770a = iM9933a == 1 ? new C0770a(windowLayoutComponentM22189a, qn3Var) : new yx2();
                    }
                    return c0770a;
                } catch (Throwable unused) {
                    return null;
                }
            default:
                return new gr7(0);
        }
    }

    public /* synthetic */ g1b(int i) {
        this.f40055a = i;
    }
}
