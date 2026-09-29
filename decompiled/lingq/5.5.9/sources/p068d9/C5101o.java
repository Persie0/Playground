package p068d9;

import android.database.Cursor;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;

/* JADX INFO: renamed from: d9.o */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5101o implements C5104r.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f33048a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C5104r f33049b;

    public /* synthetic */ C5101o(C5104r c5104r, int i10) {
        this.f33048a = i10;
        this.f33049b = c5104r;
    }

    @Override // p068d9.C5104r.a
    public final Object apply(Object obj) {
        int i10 = this.f33048a;
        C5104r c5104r = this.f33049b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                Cursor cursor = (Cursor) obj;
                c5104r.getClass();
                while (cursor.moveToNext()) {
                    c5104r.mo10854l(cursor.getInt(0), LogEventDropped.Reason.MESSAGE_TOO_OLD, cursor.getString(1));
                }
                break;
            default:
                Cursor cursor2 = (Cursor) obj;
                c5104r.getClass();
                while (cursor2.moveToNext()) {
                    c5104r.mo10854l(cursor2.getInt(0), LogEventDropped.Reason.MAX_RETRIES_REACHED, cursor2.getString(1));
                }
                break;
        }
        return null;
    }
}
