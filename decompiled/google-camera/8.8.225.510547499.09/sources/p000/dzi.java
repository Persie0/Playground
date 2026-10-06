package p000;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.google.android.gms.dynamite.p017ho.DNTdN;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dzi implements dzd {

    /* JADX INFO: renamed from: a */
    private static final nbh f12967a = nbh.m17259h("com/google/android/apps/camera/gallery/query/SpecialTypeMetadataQueryHandler");

    /* JADX INFO: renamed from: b */
    private final Context f12968b;

    /* JADX INFO: renamed from: c */
    private final String f12969c;

    public dzi(Context context, String str) {
        this.f12968b = context;
        this.f12969c = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:38:0x009a  */
    @Override // p000.dzd
    /* JADX INFO: renamed from: a */
    public final Cursor mo6958a(Uri uri, String[] strArr) {
        byte b;
        if (strArr == null) {
            return null;
        }
        mrm mrmVarM6965b = dzk.m6965b(Uri.decode(uri.getLastPathSegment()));
        if (!mrmVarM6965b.mo16813g()) {
            ((nbe) ((nbe) f12967a.m17252c()).mo17276G(1214)).mo17301z("Illegal type from uri %s including %s", uri, Arrays.toString(strArr));
            return null;
        }
        dzk dzkVar = (dzk) mrmVarM6965b.mo16809c();
        MatrixCursor matrixCursor = new MatrixCursor(strArr);
        if (dzkVar == dzk.NONE) {
            return matrixCursor;
        }
        Object[] objArr = new Object[strArr.length];
        int i = 0;
        for (String str : strArr) {
            switch (str.hashCode()) {
                case -2067576059:
                    if (str.equals("special_type_icon_uri")) {
                        b = 3;
                    } else {
                        b = -1;
                    }
                    break;
                case -1375007329:
                    if (str.equals("edit_activity_package_name")) {
                        b = 4;
                    } else {
                        b = -1;
                    }
                    break;
                case -485675384:
                    if (str.equals(DNTdN.YxJuGjmVWrYJNQM)) {
                        b = 6;
                    } else {
                        b = -1;
                    }
                    break;
                case 221347946:
                    if (str.equals("special_type_name")) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                    break;
                case 341019851:
                    if (str.equals("interact_activity_package_name")) {
                        b = 5;
                    } else {
                        b = -1;
                    }
                    break;
                case 1932752118:
                    if (str.equals("configuration")) {
                        b = 0;
                    } else {
                        b = -1;
                    }
                    break;
                case 1971189053:
                    if (str.equals("special_type_description")) {
                        b = 2;
                    } else {
                        b = -1;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                    objArr[i] = dzkVar.f12987o.f32308e;
                    break;
                case 1:
                    objArr[i] = this.f12968b.getString(dzkVar.f12988p);
                    break;
                case 2:
                    objArr[i] = this.f12968b.getString(dzkVar.f12989q);
                    break;
                case 3:
                    objArr[i] = new Uri.Builder().scheme("content").authority(this.f12969c).appendPath("icon").appendPath(String.valueOf(dzkVar.f12990r));
                    break;
                case 4:
                case 5:
                case 6:
                    objArr[i] = this.f12968b.getPackageName();
                    break;
            }
            i++;
        }
        Arrays.toString(objArr);
        matrixCursor.addRow(objArr);
        return matrixCursor;
    }
}
