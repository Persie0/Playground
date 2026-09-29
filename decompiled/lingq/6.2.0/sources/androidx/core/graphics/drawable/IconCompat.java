package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import p000.C3386nv;
import p000.ij6;
import p000.qh2;
import p000.v63;

/* JADX INFO: loaded from: classes2.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k */
    public static final PorterDuff.Mode f5503k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a */
    public int f5504a;

    /* JADX INFO: renamed from: b */
    public Object f5505b;

    /* JADX INFO: renamed from: c */
    public byte[] f5506c = null;

    /* JADX INFO: renamed from: d */
    public Parcelable f5507d = null;

    /* JADX INFO: renamed from: e */
    public int f5508e = 0;

    /* JADX INFO: renamed from: f */
    public int f5509f = 0;

    /* JADX INFO: renamed from: g */
    public ColorStateList f5510g = null;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f5511h = f5503k;

    /* JADX INFO: renamed from: i */
    public String f5512i = null;

    /* JADX INFO: renamed from: j */
    public String f5513j;

    public IconCompat(int i) {
        this.f5504a = i;
    }

    /* JADX INFO: renamed from: a */
    public static IconCompat m1994a(int i) {
        if (i == 0) {
            C3386nv.m17626m("Drawable resource ID must not be 0");
            return null;
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f5508e = i;
        iconCompat.f5505b = "";
        iconCompat.f5513j = "";
        return iconCompat;
    }

    /* JADX INFO: renamed from: b */
    public final int m1995b() {
        int i = this.f5504a;
        if (i == -1) {
            return ((Icon) this.f5505b).getResId();
        }
        if (i == 2) {
            return this.f5508e;
        }
        ij6.m13966x(this, "called getResId() on ");
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public final Uri m1996c() {
        int i = this.f5504a;
        if (i == -1) {
            return ((Icon) this.f5505b).getUri();
        }
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.f5505b);
        }
        ij6.m13966x(this, "called getUri() on ");
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final Icon m1997d(Context context) {
        Icon iconCreateWithBitmap;
        String resPackage;
        InputStream inputStreamOpenInputStream;
        int i = this.f5504a;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                return (Icon) this.f5505b;
            case 0:
            default:
                C3386nv.m17626m("Unknown type");
                return null;
            case 1:
                iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) this.f5505b);
                break;
            case 2:
                if (i == -1) {
                    resPackage = ((Icon) this.f5505b).getResPackage();
                } else {
                    if (i != 2) {
                        ij6.m13966x(this, "called getResPackage() on ");
                        return null;
                    }
                    String str = this.f5513j;
                    resPackage = (str == null || TextUtils.isEmpty(str)) ? ((String) this.f5505b).split(":", -1)[0] : this.f5513j;
                }
                iconCreateWithBitmap = Icon.createWithResource(resPackage, this.f5508e);
                break;
            case 3:
                iconCreateWithBitmap = Icon.createWithData((byte[]) this.f5505b, this.f5508e, this.f5509f);
                break;
            case 4:
                iconCreateWithBitmap = Icon.createWithContentUri((String) this.f5505b);
                break;
            case 5:
                iconCreateWithBitmap = Icon.createWithAdaptiveBitmap((Bitmap) this.f5505b);
                break;
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    iconCreateWithBitmap = qh2.m19967a(m1996c());
                } else {
                    if (context == null) {
                        C3386nv.m17625k(m1996c(), "Context is required to resolve the file uri of the icon: ");
                        return null;
                    }
                    Uri uriM1996c = m1996c();
                    String scheme = uriM1996c.getScheme();
                    if ("content".equals(scheme) || "file".equals(scheme)) {
                        try {
                            inputStreamOpenInputStream = context.getContentResolver().openInputStream(uriM1996c);
                        } catch (Exception e) {
                            Log.w("IconCompat", "Unable to load image from URI: " + uriM1996c, e);
                            inputStreamOpenInputStream = null;
                        }
                    } else {
                        try {
                            inputStreamOpenInputStream = new FileInputStream(new File((String) this.f5505b));
                        } catch (FileNotFoundException e2) {
                            Log.w("IconCompat", "Unable to load image from path: " + uriM1996c, e2);
                            inputStreamOpenInputStream = null;
                        }
                    }
                    if (inputStreamOpenInputStream == null) {
                        v63.m23127A(m1996c(), "Cannot load adaptive icon from uri: ");
                        return null;
                    }
                    iconCreateWithBitmap = Icon.createWithAdaptiveBitmap(BitmapFactory.decodeStream(inputStreamOpenInputStream));
                }
                break;
        }
        ColorStateList colorStateList = this.f5510g;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.f5511h;
        if (mode != f5503k) {
            iconCreateWithBitmap.setTintMode(mode);
        }
        return iconCreateWithBitmap;
    }

    public final String toString() {
        String str;
        if (this.f5504a == -1) {
            return String.valueOf(this.f5505b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f5504a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f5504a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f5505b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f5505b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f5513j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(m1995b())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f5508e);
                if (this.f5509f != 0) {
                    sb.append(" off=");
                    sb.append(this.f5509f);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f5505b);
                break;
        }
        if (this.f5510g != null) {
            sb.append(" tint=");
            sb.append(this.f5510g);
        }
        if (this.f5511h != f5503k) {
            sb.append(" mode=");
            sb.append(this.f5511h);
        }
        sb.append(")");
        return sb.toString();
    }
}
