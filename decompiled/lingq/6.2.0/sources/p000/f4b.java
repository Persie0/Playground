package p000;

import android.content.SharedPreferences;
import com.lingq.core.promotions.SaleEventType;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes.dex */
public final class f4b implements e4b {

    /* JADX INFO: renamed from: a */
    public final C3509qs f38419a;

    public f4b(C3509qs c3509qs, un1 un1Var) {
        c3509qs.getClass();
        un1Var.getClass();
        this.f38419a = c3509qs;
        SharedPreferences sharedPreferences = c3509qs.f58118b;
        if (sharedPreferences.getString("welcomeOfferDate", null) == null) {
            String strM14766a = hy3.f43148E.m14766a(new DateTime());
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.getClass();
            editorEdit.putString("welcomeOfferDate", strM14766a);
            editorEdit.apply();
        }
    }

    @Override // p000.e4b
    /* JADX INFO: renamed from: S */
    public final uk8 mo8581S() {
        SaleEventType saleEventType = SaleEventType.WELCOME;
        C3509qs c3509qs = this.f38419a;
        SharedPreferences sharedPreferences = c3509qs.f58118b;
        SharedPreferences sharedPreferences2 = c3509qs.f58118b;
        return new uk8(saleEventType, sharedPreferences.getString("welcomeOfferDate", null) == null ? new DateTime() : DateTime.m18332e(sharedPreferences2.getString("welcomeOfferDate", null)), (sharedPreferences2.getString("welcomeOfferDate", null) == null ? new DateTime() : DateTime.m18332e(sharedPreferences2.getString("welcomeOfferDate", null))).m18333f(1));
    }
}
