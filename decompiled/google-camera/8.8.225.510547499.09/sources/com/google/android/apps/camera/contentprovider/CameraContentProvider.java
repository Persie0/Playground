package com.google.android.apps.camera.contentprovider;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Size;
import com.google.android.apps.camera.bottombar.C0100R;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import p000.djj;
import p000.djl;
import p000.djm;
import p000.dyw;
import p000.dzx;
import p000.dzz;
import p000.eaa;
import p000.glk;
import p000.jvh;
import p000.ljf;
import p000.mqu;
import p000.mrm;
import p000.nbe;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class CameraContentProvider extends ContentProvider {

    /* JADX INFO: renamed from: a */
    private djl f6595a;

    /* JADX INFO: renamed from: b */
    private ProviderInfo f6596b;

    /* JADX INFO: renamed from: c */
    private volatile ljf f6597c;

    /* JADX INFO: renamed from: b */
    private final ljf m4087b() {
        ljf ljfVarMo6212b = this.f6597c;
        if (ljfVarMo6212b == null) {
            synchronized (this) {
                ljfVarMo6212b = this.f6597c;
                if (ljfVarMo6212b == null) {
                    ProviderInfo providerInfo = this.f6596b;
                    providerInfo.getClass();
                    djm djmVar = new djm(this, providerInfo);
                    HasCameraContentProviderComponent hasCameraContentProviderComponent = (HasCameraContentProviderComponent) getContext();
                    hasCameraContentProviderComponent.getClass();
                    djj djjVarCameraContentProviderComponent = hasCameraContentProviderComponent.cameraContentProviderComponent(djmVar);
                    djjVarCameraContentProviderComponent.mo6211a().m10423a();
                    ljfVarMo6212b = djjVarCameraContentProviderComponent.mo6212b();
                    this.f6597c = ljfVarMo6212b;
                }
            }
        }
        return ljfVarMo6212b;
    }

    /* JADX INFO: renamed from: a */
    protected final void m4088a() {
        djl djlVar = this.f6595a;
        if (djlVar != null) {
            String callingPackage = getCallingPackage();
            callingPackage.getClass();
            if (djlVar.m6214a(callingPackage)) {
                return;
            }
        }
        throw new SecurityException();
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        this.f6596b = providerInfo;
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) {
        m4088a();
        if (!TextUtils.equals("version", str)) {
            return super.call(str, str2, bundle);
        }
        m4087b();
        Bundle bundle2 = new Bundle();
        bundle2.putInt("version", 3);
        return bundle2;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 1;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("Insert not allowed on the CameraContentProvider");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Trace.beginSection("GCA_CameraContentProvider#onCreate");
        Context context = getContext();
        context.getClass();
        HasCameraContentProviderComponent hasCameraContentProviderComponent = (HasCameraContentProviderComponent) getContext();
        hasCameraContentProviderComponent.getClass();
        hasCameraContentProviderComponent.initAppComponent();
        this.f6595a = new djl(context, new HashSet(Arrays.asList(context.getResources().getStringArray(C0100R.array.trusted_certificates))));
        Trace.endSection();
        return true;
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) throws Throwable {
        ParcelFileDescriptor parcelFileDescriptorOpenPipeHelper;
        int i;
        m4088a();
        Trace.beginSection("GCA_SpecialTypes#openFile");
        ljf ljfVarM4087b = m4087b();
        if (!"r".equals(str)) {
            throw new IllegalArgumentException("Unsupported mode: ".concat(String.valueOf(str)));
        }
        switch (((UriMatcher) ljfVarM4087b.f38375g).match(uri)) {
            case 3:
                i = C0100R.dimen.photos_oemapi_badge_icon_size;
                parcelFileDescriptorOpenPipeHelper = ljfVarM4087b.m15534k(uri, i);
                Trace.endSection();
                return parcelFileDescriptorOpenPipeHelper;
            case 4:
                i = C0100R.dimen.photos_oemapi_interact_icon_size;
                parcelFileDescriptorOpenPipeHelper = ljfVarM4087b.m15534k(uri, i);
                Trace.endSection();
                return parcelFileDescriptorOpenPipeHelper;
            case 5:
                i = C0100R.dimen.photos_oemapi_dialog_icon_size;
                parcelFileDescriptorOpenPipeHelper = ljfVarM4087b.m15534k(uri, i);
                Trace.endSection();
                return parcelFileDescriptorOpenPipeHelper;
            case 6:
            case 7:
            default:
                throw new IllegalArgumentException("Unrecognized format: ".concat(String.valueOf(String.valueOf(uri))));
            case 8:
                try {
                    Object obj = ljfVarM4087b.f38371c;
                    int i2 = dzx.f13020b + 1;
                    dzx.f13020b = i2;
                    long id = ContentUris.parseId(uri);
                    final String str2 = ("[r" + i2 + "]") + "[m" + id + "] ";
                    mrm mrmVarM16829i = mqu.f41450a;
                    String queryParameter = uri.getQueryParameter("width");
                    String queryParameter2 = uri.getQueryParameter("height");
                    if (queryParameter != null && queryParameter2 != null) {
                        mrmVarM16829i = mrm.m16829i(new Size(Integer.parseInt(queryParameter), Integer.parseInt(queryParameter2)));
                    }
                    mrm mrmVarM6952a = ((dzx) obj).f13023e.m6952a(id);
                    if (!mrmVarM6952a.mo16813g()) {
                        ((nbe) ((nbe) dzx.f13019a.m17251b()).mo17276G((char) 1226)).mo17293r("%s ProcessingMedia does not exist in ProcessingMediaManager", str2);
                        throw new eaa("ProcessingMedia does not exist in ProcessingMediaManager");
                    }
                    dyw dywVar = (dyw) mrmVarM6952a.mo16809c();
                    Bitmap bitmapM6945b = dywVar.m6945b();
                    if (bitmapM6945b == null) {
                        ((nbe) ((nbe) dzx.f13019a.m17251b()).mo17276G((char) 1225)).mo17293r("%s thumbnail bitmap is not set in ProcessingMedia", str2);
                        throw new eaa("Thumbnail bitmap is not set in ProcessingMedia");
                    }
                    if (mrmVarM16829i.mo16813g()) {
                        ((dzx) obj).f13021c.mo13961e("CAM_ProcessingMedia" + str2 + "Bitmap.createScaledBitmap#size=" + mrmVarM16829i.mo16809c().toString());
                        Size size = (Size) mrmVarM16829i.mo16809c();
                        int width = bitmapM6945b.getWidth();
                        int height = bitmapM6945b.getHeight();
                        int width2 = size.getWidth();
                        int height2 = size.getHeight();
                        if (width > width2 || height > height2) {
                            if (width / height > width2 / height2) {
                                height2 = (height * width2) / width;
                            } else {
                                width2 = (width * height2) / height;
                            }
                            bitmapM6945b = Bitmap.createScaledBitmap(bitmapM6945b, width2, height2, false);
                        }
                        ((dzx) obj).f13021c.mo13962f();
                    }
                    int iM6944a = dywVar.m6944a();
                    if (iM6944a != 0) {
                        ((dzx) obj).f13021c.mo13961e("CAM_ProcessingMedia" + str2 + "Bitmap.rotateBitmap#rotation=" + iM6944a);
                        bitmapM6945b = jvh.m13543A(bitmapM6945b, iM6944a);
                        ((dzx) obj).f13021c.mo13962f();
                    }
                    ((dzx) obj).f13021c.mo13961e("CAM_ProcessingMedia" + str2 + "BitmapSerializer.serialize");
                    try {
                        try {
                            dzz dzzVar = ((dzx) obj).f13022d;
                            if (!mrmVarM16829i.mo16813g()) {
                                dzzVar = ((dzx) obj).f13024f;
                            }
                            final ByteArrayOutputStream byteArrayOutputStreamMo6976a = dzzVar.mo6976a(bitmapM6945b);
                            ((dzx) obj).f13021c.mo13962f();
                            final dzx dzxVar = (dzx) obj;
                            parcelFileDescriptorOpenPipeHelper = ((ContentProvider) ljfVarM4087b.f38373e).openPipeHelper(Uri.EMPTY, "", Bundle.EMPTY, "", new ContentProvider.PipeDataWriter() { // from class: dzw
                                @Override // android.content.ContentProvider.PipeDataWriter
                                public final void writeDataToPipe(ParcelFileDescriptor parcelFileDescriptor, Uri uri2, String str3, Bundle bundle, Object obj2) {
                                    kbz kbzVar;
                                    dzx dzxVar2 = dzxVar;
                                    String str4 = str2;
                                    ByteArrayOutputStream byteArrayOutputStream = byteArrayOutputStreamMo6976a;
                                    FileDescriptor fileDescriptor = parcelFileDescriptor.getFileDescriptor();
                                    dzxVar2.f13021c.mo13961e("CAM_ProcessingMedia" + str4 + "ByteArrayOutputStream.writeTo#fd=" + String.valueOf(fileDescriptor));
                                    try {
                                        try {
                                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileDescriptor));
                                            try {
                                                byteArrayOutputStream.writeTo(bufferedOutputStream);
                                                bufferedOutputStream.close();
                                                kbzVar = dzxVar2.f13021c;
                                            } catch (Throwable th) {
                                                try {
                                                    bufferedOutputStream.close();
                                                } catch (Throwable th2) {
                                                    try {
                                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                                    } catch (Exception e) {
                                                    }
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th3) {
                                            dzxVar2.f13021c.mo13962f();
                                            throw th3;
                                        }
                                    } catch (IOException e2) {
                                        ((nbe) ((nbe) ((nbe) dzx.f13019a.m17251b()).mo17283h(e2)).mo17276G(1228)).mo17290o("Error when writeTo the ParcelFileDescriptor");
                                        kbzVar = dzxVar2.f13021c;
                                    }
                                    kbzVar.mo13962f();
                                }
                            });
                            Trace.endSection();
                            return parcelFileDescriptorOpenPipeHelper;
                        } catch (IOException e) {
                            throw new eaa(e);
                        }
                    } catch (Throwable th) {
                        ((dzx) obj).f13021c.mo13962f();
                        throw th;
                    }
                } catch (eaa e2) {
                    throw new FileNotFoundException("Cannot load thumbnail for URI= " + String.valueOf(uri) + " ex=" + e2.getMessage());
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v6, types: [dzd] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        ?? r4;
        m4088a();
        Trace.beginSection("GCA_SpecialTypes#query");
        ljf ljfVarM4087b = m4087b();
        ljfVarM4087b.f38369a.mo13961e("SpecialTypesQuery");
        glk glkVar = (glk) ljfVarM4087b.f38374f;
        switch (((UriMatcher) glkVar.f25502c).match(uri)) {
            case 1:
                r4 = glkVar.f25501b;
                break;
            case 2:
                r4 = glkVar.f25500a;
                break;
            case 7:
            case 8:
                r4 = glkVar.f25503d;
                break;
            default:
                throw new IllegalArgumentException("Unrecognized uri: ".concat(String.valueOf(String.valueOf(uri))));
        }
        Cursor cursorMo6958a = r4.mo6958a(uri, strArr);
        ljfVarM4087b.f38369a.mo13962f();
        Trace.endSection();
        return cursorMo6958a;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("Update not allowed on the CameraContentProvider");
    }
}
