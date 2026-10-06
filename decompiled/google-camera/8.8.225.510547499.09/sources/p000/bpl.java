package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Trace;
import com.google.android.apps.camera.filmstrip.GlideConfiguration;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class bpl implements cbc {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ box f4065a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ List f4066b;

    /* JADX INFO: renamed from: c */
    private boolean f4067c;

    public bpl(box boxVar, List list) {
        this.f4065a = boxVar;
        this.f4066b = list;
    }

    @Override // p000.cbc
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo2844a() throws Throwable {
        bwm bwmVar;
        bqt bxoVar;
        Context context;
        bpl bplVar = this;
        if (bplVar.f4067c) {
            throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        }
        Trace.beginSection("Glide registry");
        bplVar.f4067c = true;
        try {
            box boxVar = bplVar.f4065a;
            List<GlideConfiguration> list = bplVar.f4066b;
            bti btiVar = boxVar.f4032a;
            btg btgVar = boxVar.f4034c;
            Context applicationContext = boxVar.f4033b.getApplicationContext();
            bko bkoVar = boxVar.f4033b.f4045f;
            bpk bpkVar = new bpk();
            bpkVar.m2841i(new bwt());
            bpkVar.m2841i(new bxf());
            Resources resources = applicationContext.getResources();
            List listM2834b = bpkVar.m2834b();
            byf byfVar = new byf(applicationContext, listM2834b, btiVar, btgVar);
            try {
                bxw bxwVar = new bxw(btiVar, new bxt(2));
                bxb bxbVar = new bxb(bpkVar.m2834b(), resources.getDisplayMetrics(), btiVar, btgVar);
                if (bkoVar.m2607a(boy.class)) {
                    bxoVar = new bwm(2, (byte[]) null);
                    bwmVar = new bwm(0);
                } else {
                    bwmVar = new bwm(bxbVar, 1);
                    bxoVar = new bxo(bxbVar, btgVar, 0);
                }
                bpkVar.m2840h("Animation", InputStream.class, Drawable.class, new bwm(new dsx(listM2834b, btgVar), 5, null, null, null, null));
                bpkVar.m2840h("Animation", ByteBuffer.class, Drawable.class, new bwm(new dsx(listM2834b, btgVar), 4, null, null, null, null));
                byd bydVar = new byd(applicationContext);
                bwj bwjVar = new bwj(btgVar);
                byq byqVar = new byq(1);
                byt bytVar = new byt(1);
                ContentResolver contentResolver = applicationContext.getContentResolver();
                bpkVar.m2836d(ByteBuffer.class, new buq());
                bpkVar.m2836d(InputStream.class, new bvs(btgVar));
                bpkVar.m2840h("Bitmap", ByteBuffer.class, Bitmap.class, bwmVar);
                bpkVar.m2840h("Bitmap", InputStream.class, Bitmap.class, bxoVar);
                if (bro.m2956d()) {
                    bpkVar.m2840h("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new bwm(bxbVar, 3));
                }
                bpkVar.m2840h("Bitmap", ParcelFileDescriptor.class, Bitmap.class, bxwVar);
                bpkVar.m2840h("Bitmap", AssetFileDescriptor.class, Bitmap.class, new bxw(btiVar, new bxt(1)));
                bpkVar.m2839g(Bitmap.class, Bitmap.class, bvx.f4566a);
                bpkVar.m2840h("Bitmap", Bitmap.class, Bitmap.class, new bye(1));
                bpkVar.m2837e(Bitmap.class, bwjVar);
                bpkVar.m2840h("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new bwh(resources, bwmVar));
                bpkVar.m2840h("BitmapDrawable", InputStream.class, BitmapDrawable.class, new bwh(resources, bxoVar));
                bpkVar.m2840h("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new bwh(resources, bxwVar));
                bpkVar.m2837e(BitmapDrawable.class, new bwi(btiVar, bwjVar));
                bpkVar.m2840h("Animation", InputStream.class, byh.class, new byp(listM2834b, byfVar, btgVar));
                bpkVar.m2840h("Animation", ByteBuffer.class, byh.class, byfVar);
                bpkVar.m2837e(byh.class, new byi());
                bpkVar.m2839g(bpz.class, bpz.class, bvx.f4566a);
                bpkVar.m2840h("Bitmap", bpz.class, Bitmap.class, new bwm(btiVar, 6));
                bpkVar.m2838f(Uri.class, Drawable.class, bydVar);
                bpkVar.m2838f(Uri.class, Bitmap.class, new bxo(bydVar, btiVar, 1));
                bpkVar.m2842j(new bxx());
                bpkVar.m2839g(File.class, ByteBuffer.class, new bup(2));
                bpkVar.m2839g(File.class, InputStream.class, new bux(new bva(0), 0));
                bpkVar.m2838f(File.class, File.class, new bye(2));
                bpkVar.m2839g(File.class, ParcelFileDescriptor.class, new bux(new bva(1), 0));
                bpkVar.m2839g(File.class, File.class, bvx.f4566a);
                bpkVar.m2842j(new brk(btgVar));
                if (bro.m2956d()) {
                    bpkVar.m2842j(new brn());
                }
                if (bkoVar.m2607a(bpb.class)) {
                    context = applicationContext;
                    but butVar = new but(context, 2);
                    but butVar2 = new but(context, 1);
                    but butVar3 = new but(context, 0);
                    bpkVar.m2839g(Integer.TYPE, InputStream.class, butVar);
                    bpkVar.m2839g(Integer.class, InputStream.class, butVar);
                    bpkVar.m2839g(Integer.TYPE, AssetFileDescriptor.class, butVar2);
                    bpkVar.m2839g(Integer.class, AssetFileDescriptor.class, butVar2);
                    bpkVar.m2839g(Integer.TYPE, Drawable.class, butVar3);
                    bpkVar.m2839g(Integer.class, Drawable.class, butVar3);
                    bpkVar.m2839g(Uri.class, InputStream.class, new bux(context, 3));
                    bpkVar.m2839g(Uri.class, AssetFileDescriptor.class, new bux(context, 2));
                } else {
                    context = applicationContext;
                    bvr bvrVar = new bvr(resources, 3);
                    bvr bvrVar2 = new bvr(resources, 2);
                    bvr bvrVar3 = new bvr(resources, 0);
                    bpkVar.m2839g(Integer.TYPE, InputStream.class, bvrVar);
                    bpkVar.m2839g(Integer.class, InputStream.class, bvrVar);
                    bpkVar.m2839g(Integer.TYPE, ParcelFileDescriptor.class, bvrVar2);
                    bpkVar.m2839g(Integer.class, ParcelFileDescriptor.class, bvrVar2);
                    bpkVar.m2839g(Integer.TYPE, AssetFileDescriptor.class, bvrVar3);
                    bpkVar.m2839g(Integer.class, AssetFileDescriptor.class, bvrVar3);
                }
                bvr bvrVar4 = new bvr(resources, 4);
                bpkVar.m2839g(Integer.class, Uri.class, bvrVar4);
                bpkVar.m2839g(Integer.TYPE, Uri.class, bvrVar4);
                bpkVar.m2839g(String.class, InputStream.class, new bux(1, (byte[]) null));
                bpkVar.m2839g(Uri.class, InputStream.class, new bux(1, (byte[]) null));
                bpkVar.m2839g(String.class, InputStream.class, new bup(5));
                bpkVar.m2839g(String.class, ParcelFileDescriptor.class, new bup(4));
                bpkVar.m2839g(String.class, AssetFileDescriptor.class, new bup(3));
                bpkVar.m2839g(Uri.class, InputStream.class, new bul(context.getAssets(), 0));
                bpkVar.m2839g(Uri.class, AssetFileDescriptor.class, new bul(context.getAssets(), 1));
                bpkVar.m2839g(Uri.class, InputStream.class, new bvr(context, 6));
                bpkVar.m2839g(Uri.class, InputStream.class, new bvr(context, 7));
                bpkVar.m2839g(Uri.class, InputStream.class, new bwa(context, InputStream.class));
                bpkVar.m2839g(Uri.class, ParcelFileDescriptor.class, new bwa(context, ParcelFileDescriptor.class));
                bpkVar.m2839g(Uri.class, InputStream.class, new bvu(contentResolver, bkoVar, 2, null));
                bpkVar.m2839g(Uri.class, ParcelFileDescriptor.class, new bvu(contentResolver, bkoVar, 0, null));
                bpkVar.m2839g(Uri.class, AssetFileDescriptor.class, new bvu(contentResolver, bkoVar, 1, null));
                bpkVar.m2839g(Uri.class, InputStream.class, new bvx(0));
                bpkVar.m2839g(URL.class, InputStream.class, new bvx(2));
                bpkVar.m2839g(Uri.class, File.class, new bvr(context, 1));
                bpkVar.m2839g(bvc.class, InputStream.class, new bvr(5));
                bpkVar.m2839g(byte[].class, ByteBuffer.class, new bup(1));
                bpkVar.m2839g(byte[].class, InputStream.class, new bup(0));
                bpkVar.m2839g(Uri.class, Uri.class, bvx.f4566a);
                bpkVar.m2839g(Drawable.class, Drawable.class, bvx.f4566a);
                bpkVar.m2838f(Drawable.class, Drawable.class, new bye(0));
                bpkVar.m2843k(Bitmap.class, BitmapDrawable.class, new byq(resources, 0));
                bpkVar.m2843k(Bitmap.class, byte[].class, byqVar);
                bpkVar.m2843k(Drawable.class, byte[].class, new byr(btiVar, byqVar, bytVar));
                bpkVar.m2843k(byh.class, byte[].class, bytVar);
                bxw bxwVar2 = new bxw(btiVar, new bxt(0));
                bpkVar.m2838f(ByteBuffer.class, Bitmap.class, bxwVar2);
                bpkVar.m2838f(ByteBuffer.class, BitmapDrawable.class, new bwh(resources, bxwVar2));
                for (GlideConfiguration glideConfiguration : list) {
                }
                this.f4067c = false;
                Trace.endSection();
                return bpkVar;
            } catch (Throwable th) {
                th = th;
                bplVar = this;
                bplVar.f4067c = false;
                Trace.endSection();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
