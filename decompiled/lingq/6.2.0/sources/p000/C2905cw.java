package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import coil.decode.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import kotlin.coroutines.Continuation;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: cw */
/* JADX INFO: loaded from: classes2.dex */
public final class C2905cw implements a33 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34617a;

    /* JADX INFO: renamed from: b */
    public final Uri f34618b;

    /* JADX INFO: renamed from: c */
    public final sz6 f34619c;

    public /* synthetic */ C2905cw(Uri uri, sz6 sz6Var, int i) {
        this.f34617a = i;
        this.f34618b = uri;
        this.f34619c = sz6Var;
    }

    /* JADX WARN: Code duplicated, block: B:82:0x01b9  */
    @Override // p000.a33
    /* JADX INFO: renamed from: a */
    public final Object mo57a(Continuation continuation) throws XmlPullParserException, IOException {
        InputStream inputStreamOpenInputStream;
        List<String> pathSegments;
        int size;
        Bundle bundle;
        Integer numM4844a0;
        Drawable drawable;
        int i = this.f34617a;
        Uri uri = this.f34618b;
        sz6 sz6Var = this.f34619c;
        boolean z = true;
        switch (i) {
            case 0:
                String strM22596N0 = u91.m22596N0(u91.m22584B0(uri.getPathSegments(), 1), "/", null, null, null, 62);
                return new ee9(new ae9(new e18(r46.m20369L(sz6Var.f61659a.getAssets().open(strM22596N0))), new C0788aw()), AbstractC3057h.m12987b(MimeTypeMap.getSingleton(), strM22596N0), DataSource.DISK);
            case 1:
                ContentResolver contentResolver = sz6Var.f61659a.getContentResolver();
                if (fa4.m11650l(uri.getAuthority(), "com.android.contacts") && fa4.m11650l(uri.getLastPathSegment(), "display_photo")) {
                    AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                    inputStreamOpenInputStream = assetFileDescriptorOpenAssetFileDescriptor != null ? assetFileDescriptorOpenAssetFileDescriptor.createInputStream() : null;
                    if (inputStreamOpenInputStream == null) {
                        C3386nv.m17634u("Unable to find a contact photo associated with '", uri, "'.");
                        return null;
                    }
                } else if (fa4.m11650l(uri.getAuthority(), "media") && (size = (pathSegments = uri.getPathSegments()).size()) >= 3 && fa4.m11650l(pathSegments.get(size - 3), "audio") && fa4.m11650l(pathSegments.get(size - 2), "albums")) {
                    w89 w89Var = sz6Var.f61662d;
                    pvc pvcVar = w89Var.f66531a;
                    lg2 lg2Var = pvcVar instanceof lg2 ? (lg2) pvcVar : null;
                    if (lg2Var != null) {
                        int i2 = lg2Var.f49621n;
                        pvc pvcVar2 = w89Var.f66532b;
                        lg2 lg2Var2 = pvcVar2 instanceof lg2 ? (lg2) pvcVar2 : null;
                        if (lg2Var2 != null) {
                            int i3 = lg2Var2.f49621n;
                            bundle = new Bundle(1);
                            bundle.putParcelable("android.content.extra.SIZE", new Point(i2, i3));
                        } else {
                            bundle = null;
                        }
                    } else {
                        bundle = null;
                    }
                    AssetFileDescriptor assetFileDescriptorOpenTypedAssetFile = contentResolver.openTypedAssetFile(uri, "image/*", bundle, null);
                    inputStreamOpenInputStream = assetFileDescriptorOpenTypedAssetFile != null ? assetFileDescriptorOpenTypedAssetFile.createInputStream() : null;
                    if (inputStreamOpenInputStream == null) {
                        C3386nv.m17634u("Unable to find a music thumbnail associated with '", uri, "'.");
                        return null;
                    }
                } else {
                    inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                    if (inputStreamOpenInputStream == null) {
                        C3386nv.m17634u("Unable to open '", uri, "'.");
                        return null;
                    }
                }
                return new ee9(new ae9(new e18(r46.m20369L(inputStreamOpenInputStream)), new C0788aw()), contentResolver.getType(uri), DataSource.DISK);
            default:
                String authority = uri.getAuthority();
                if (authority != null) {
                    if (vk9.m23391n0(authority)) {
                        authority = null;
                    }
                    if (authority != null) {
                        String str = (String) u91.m22598P0(uri.getPathSegments());
                        if (str == null || (numM4844a0 = cl9.m4844a0(str)) == null) {
                            ij6.m13966x(uri, "Invalid android.resource URI: ");
                            return null;
                        }
                        int iIntValue = numM4844a0.intValue();
                        Context context = sz6Var.f61659a;
                        Resources resources = authority.equals(context.getPackageName()) ? context.getResources() : context.getPackageManager().getResourcesForApplication(authority);
                        TypedValue typedValue = new TypedValue();
                        resources.getValue(iIntValue, typedValue, true);
                        CharSequence charSequence = typedValue.string;
                        String strM12987b = AbstractC3057h.m12987b(MimeTypeMap.getSingleton(), charSequence.subSequence(vk9.m23393p0(charSequence, '/', 0, 6), charSequence.length()).toString());
                        if (!fa4.m11650l(strM12987b, "text/xml")) {
                            TypedValue typedValue2 = new TypedValue();
                            return new ee9(new ae9(new e18(r46.m20369L(resources.openRawResource(iIntValue, typedValue2))), new b88(typedValue2.density)), strM12987b, DataSource.DISK);
                        }
                        if (authority.equals(context.getPackageName())) {
                            drawable = bna.m3932U(context, iIntValue);
                            if (drawable == null) {
                                gm5.m12751g(ux5.m22988k(iIntValue, "Invalid resource ID: "));
                                return null;
                            }
                        } else {
                            XmlResourceParser xml = resources.getXml(iIntValue);
                            int next = xml.next();
                            while (next != 2 && next != 1) {
                                next = xml.next();
                            }
                            if (next != 2) {
                                throw new XmlPullParserException("No start tag found.");
                            }
                            Resources.Theme theme = context.getTheme();
                            ThreadLocal threadLocal = f88.f38630a;
                            drawable = resources.getDrawable(iIntValue, theme);
                            if (drawable == null) {
                                gm5.m12751g(ux5.m22988k(iIntValue, "Invalid resource ID: "));
                                return null;
                            }
                        }
                        if (!(drawable instanceof VectorDrawable) && !(drawable instanceof poa)) {
                            z = false;
                        }
                        if (z) {
                            drawable = new BitmapDrawable(context.getResources(), sbd.m21208a(drawable, sz6Var.f61660b, sz6Var.f61662d, sz6Var.f61663e, sz6Var.f61664f));
                        }
                        return new sl2(drawable, z, DataSource.DISK);
                    }
                }
                ij6.m13966x(uri, "Invalid android.resource URI: ");
                return null;
        }
    }
}
