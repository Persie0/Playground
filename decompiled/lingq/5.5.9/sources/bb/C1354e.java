package bb;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.AbstractC2544c;
import com.google.android.gms.common.api.C2542a;
import java.util.ArrayList;
import java.util.List;
import p070db.C5127g;
import p176ib.C6254b;

/* JADX INFO: renamed from: bb.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1354e extends C2542a.a {
    @Override // com.google.android.gms.common.api.C2542a.d
    /* JADX INFO: renamed from: a */
    public final List mo4929a(GoogleSignInOptions googleSignInOptions) {
        return new ArrayList(googleSignInOptions.f13820b);
    }

    @Override // com.google.android.gms.common.api.C2542a.a
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2542a.e mo4928b(Context context, Looper looper, C6254b c6254b, Object obj, AbstractC2544c.a aVar, AbstractC2544c.b bVar) {
        return new C5127g(context, looper, c6254b, (GoogleSignInOptions) obj, aVar, bVar);
    }
}
