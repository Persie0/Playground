package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k */
    public static final PorterDuff.Mode f5581k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a */
    public int f5582a;

    /* JADX INFO: renamed from: b */
    public Object f5583b;

    /* JADX INFO: renamed from: c */
    public byte[] f5584c;

    /* JADX INFO: renamed from: d */
    public Parcelable f5585d;

    /* JADX INFO: renamed from: e */
    public int f5586e;

    /* JADX INFO: renamed from: f */
    public int f5587f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f5588g;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f5589h;

    /* JADX INFO: renamed from: i */
    public String f5590i;

    /* JADX INFO: renamed from: j */
    public String f5591j;

    /* JADX INFO: renamed from: androidx.core.graphics.drawable.IconCompat$a */
    public static class C0778a {
        /* JADX INFO: renamed from: a */
        public static int m2966a(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C0780c.m2974a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon resource", e10);
                return 0;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon resource", e11);
                return 0;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon resource", e12);
                return 0;
            }
        }

        /* JADX INFO: renamed from: b */
        public static String m2967b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C0780c.m2975b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon package", e10);
                return null;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon package", e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon package", e12);
                return null;
            }
        }

        /* JADX INFO: renamed from: c */
        public static int m2968c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C0780c.m2976c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e10);
                return -1;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e11);
                return -1;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e12);
                return -1;
            }
        }

        /* JADX INFO: renamed from: d */
        public static Uri m2969d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C0780c.m2977d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon uri", e10);
                return null;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon uri", e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon uri", e12);
                return null;
            }
        }

        /* JADX INFO: renamed from: e */
        public static Drawable m2970e(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        /* JADX INFO: renamed from: f */
        public static Icon m2971f(IconCompat iconCompat, Context context) {
            Icon iconCreateWithBitmap;
            InputStream inputStreamOpenInputStream;
            switch (iconCompat.f5582a) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    return (Icon) iconCompat.f5583b;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f5583b);
                    break;
                case 2:
                    iconCreateWithBitmap = Icon.createWithResource(iconCompat.m2964c(), iconCompat.f5586e);
                    break;
                case 3:
                    iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.f5583b, iconCompat.f5586e, iconCompat.f5587f);
                    break;
                case 4:
                    iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.f5583b);
                    break;
                case 5:
                    iconCreateWithBitmap = C0779b.m2973b((Bitmap) iconCompat.f5583b);
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (Build.VERSION.SDK_INT >= 30) {
                        iconCreateWithBitmap = C0781d.m2978a(iconCompat.m2965d());
                    } else {
                        if (context == null) {
                            throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.m2965d());
                        }
                        Uri uriM2965d = iconCompat.m2965d();
                        String scheme = uriM2965d.getScheme();
                        if ("content".equals(scheme) || "file".equals(scheme)) {
                            try {
                                inputStreamOpenInputStream = context.getContentResolver().openInputStream(uriM2965d);
                            } catch (Exception e10) {
                                Log.w("IconCompat", "Unable to load image from URI: " + uriM2965d, e10);
                                inputStreamOpenInputStream = null;
                            }
                        } else {
                            try {
                                inputStreamOpenInputStream = new FileInputStream(new File((String) iconCompat.f5583b));
                            } catch (FileNotFoundException e11) {
                                Log.w("IconCompat", "Unable to load image from path: " + uriM2965d, e11);
                                inputStreamOpenInputStream = null;
                            }
                        }
                        if (inputStreamOpenInputStream == null) {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.m2965d());
                        }
                        iconCreateWithBitmap = C0779b.m2973b(BitmapFactory.decodeStream(inputStreamOpenInputStream));
                    }
                    break;
            }
            ColorStateList colorStateList = iconCompat.f5588g;
            if (colorStateList != null) {
                iconCreateWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f5589h;
            if (mode != IconCompat.f5581k) {
                iconCreateWithBitmap.setTintMode(mode);
            }
            return iconCreateWithBitmap;
        }
    }

    /* JADX INFO: renamed from: androidx.core.graphics.drawable.IconCompat$b */
    public static class C0779b {
        /* JADX INFO: renamed from: a */
        public static Drawable m2972a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        /* JADX INFO: renamed from: b */
        public static Icon m2973b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    /* JADX INFO: renamed from: androidx.core.graphics.drawable.IconCompat$c */
    public static class C0780c {
        /* JADX INFO: renamed from: a */
        public static int m2974a(Object obj) {
            return ((Icon) obj).getResId();
        }

        /* JADX INFO: renamed from: b */
        public static String m2975b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        /* JADX INFO: renamed from: c */
        public static int m2976c(Object obj) {
            return ((Icon) obj).getType();
        }

        /* JADX INFO: renamed from: d */
        public static Uri m2977d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    /* JADX INFO: renamed from: androidx.core.graphics.drawable.IconCompat$d */
    public static class C0781d {
        /* JADX INFO: renamed from: a */
        public static Icon m2978a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f5582a = -1;
        this.f5584c = null;
        this.f5585d = null;
        this.f5586e = 0;
        this.f5587f = 0;
        this.f5588g = null;
        this.f5589h = f5581k;
        this.f5590i = null;
    }

    public IconCompat(int i10) {
        this.f5584c = null;
        this.f5585d = null;
        this.f5586e = 0;
        this.f5587f = 0;
        this.f5588g = null;
        this.f5589h = f5581k;
        this.f5590i = null;
        this.f5582a = i10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static IconCompat m2962a(Resources resources, String str, int i10) {
        str.getClass();
        if (i10 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f5586e = i10;
        if (resources != null) {
            try {
                iconCompat.f5583b = resources.getResourceName(i10);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f5583b = str;
        }
        iconCompat.f5591j = str;
        return iconCompat;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final int m2963b() {
        int i10 = this.f5582a;
        if (i10 == -1) {
            return C0778a.m2966a(this.f5583b);
        }
        if (i10 == 2) {
            return this.f5586e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public final String m2964c() {
        int i10 = this.f5582a;
        if (i10 == -1) {
            return C0778a.m2967b(this.f5583b);
        }
        if (i10 == 2) {
            String str = this.f5591j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f5583b).split(":", -1)[0] : this.f5591j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    /* JADX INFO: renamed from: d */
    public final Uri m2965d() {
        int i10 = this.f5582a;
        if (i10 == -1) {
            return C0778a.m2969d(this.f5583b);
        }
        if (i10 == 4 || i10 == 6) {
            return Uri.parse((String) this.f5583b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public final String toString() {
        String str;
        if (this.f5582a == -1) {
            return String.valueOf(this.f5583b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        switch (this.f5582a) {
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
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb2.append(str);
        switch (this.f5582a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f5583b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f5583b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f5591j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(m2963b())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f5586e);
                if (this.f5587f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f5587f);
                }
                break;
            case 4:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                sb2.append(" uri=");
                sb2.append(this.f5583b);
                break;
        }
        if (this.f5588g != null) {
            sb2.append(" tint=");
            sb2.append(this.f5588g);
        }
        if (this.f5589h != f5581k) {
            sb2.append(" mode=");
            sb2.append(this.f5589h);
        }
        sb2.append(")");
        return sb2.toString();
    }
}
