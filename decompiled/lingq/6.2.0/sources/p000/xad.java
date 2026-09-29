package p000;

import android.content.res.Resources;
import android.view.View;
import kotlin.Result;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xad {

    /* JADX INFO: renamed from: a */
    public static p04 f68016a;

    /* JADX INFO: renamed from: a */
    public static String m24432a(View view) {
        Object failure;
        view.getClass();
        String strConcat = null;
        try {
            if (view.getId() == -1 || ((view.getId() & (-16777216)) == 0 && (view.getId() & 16777215) != 0)) {
                throw new Resources.NotFoundException();
            }
            Resources resources = view.getContext().getResources();
            failure = resources != null ? resources.getResourceEntryName(view.getId()) : null;
            if (failure == null) {
                failure = "";
            }
            if (Result.m15355a(failure) != null) {
                if (view.getId() != -1) {
                    int id = view.getId();
                    ci8.m4727l(16);
                    String string = Integer.toString(id, 16);
                    string.getClass();
                    strConcat = "0x".concat(string);
                }
                failure = strConcat;
            }
            return (String) failure;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
    }
}
