package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class idd {
    /* JADX WARN: Code duplicated, block: B:22:0x003c  */
    /* JADX INFO: renamed from: a */
    public static final String m13801a(Context context, Uri uri) throws IOException {
        int columnIndex;
        String string;
        if (!fa4.m11650l(uri != null ? uri.getScheme() : null, "content")) {
            return null;
        }
        Cursor cursorQuery = context.getContentResolver().query(uri, null, null, null, null);
        if (cursorQuery != null) {
            try {
                if (!cursorQuery.moveToFirst() || (columnIndex = cursorQuery.getColumnIndex("_display_name")) == -1) {
                    string = null;
                } else {
                    string = cursorQuery.getString(columnIndex);
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3584sr.m21646y(cursorQuery, th);
                    throw th2;
                }
            }
        } else {
            string = null;
        }
        AbstractC3584sr.m21646y(cursorQuery, null);
        return string;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo13802b(yzc yzcVar, yzc yzcVar2);

    /* JADX INFO: renamed from: c */
    public abstract void mo13803c(yzc yzcVar, Thread thread);

    /* JADX INFO: renamed from: d */
    public abstract boolean mo13804d(m6d m6dVar, fec fecVar, fec fecVar2);

    /* JADX INFO: renamed from: e */
    public abstract boolean mo13805e(m6d m6dVar, Object obj, Object obj2);

    /* JADX INFO: renamed from: f */
    public abstract boolean mo13806f(m6d m6dVar, yzc yzcVar, yzc yzcVar2);
}
