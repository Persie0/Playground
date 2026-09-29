package com.bumptech.glide;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.C2104k;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.C2140a;
import com.bumptech.glide.load.resource.bitmap.C2142c;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import p006a5.C0020c;
import p007a6.C0022a;
import p007a6.C0023b;
import p007a6.C0030i;
import p007a6.C0031j;
import p007a6.C0037p;
import p007a6.C0040s;
import p007a6.C0041t;
import p007a6.C0044w;
import p027b6.C1321a;
import p041c5.C1702c;
import p042c6.C1729a;
import p042c6.C1733e;
import p042c6.C1734f;
import p065d6.C5047a;
import p081e0.C5298b1;
import p081e0.C5320k0;
import p087e6.C5372a;
import p087e6.C5374c;
import p087e6.C5378g;
import p087e6.C5380i;
import p110f6.C5470a;
import p132g6.InterfaceC5704c;
import p147h6.C5894a;
import p290o6.C7967l0;
import p332q5.InterfaceC8494a;
import p338qd.C8573r0;
import p356r5.InterfaceC8736f;
import p392t5.C9203i;
import p407u5.InterfaceC9451b;
import p407u5.InterfaceC9452c;
import p474x5.C10076a;
import p474x5.C10077b;
import p474x5.C10078c;
import p474x5.C10079d;
import p474x5.C10080e;
import p474x5.C10081f;
import p474x5.C10082g;
import p474x5.C10086k;
import p474x5.C10095t;
import p474x5.C10096u;
import p474x5.C10097v;
import p474x5.C10098w;
import p474x5.C10099x;
import p474x5.C10100y;
import p500y5.C10292a;
import p500y5.C10293b;
import p500y5.C10294c;
import p500y5.C10295d;
import p500y5.C10296e;

/* JADX INFO: renamed from: com.bumptech.glide.j */
/* JADX INFO: loaded from: classes.dex */
public final class C2088j {
    /* JADX INFO: renamed from: a */
    public static Registry m6241a(ComponentCallbacks2C2080b componentCallbacks2C2080b, List list) {
        InterfaceC8736f c0030i;
        InterfaceC8736f c2142c;
        InterfaceC9452c interfaceC9452c = componentCallbacks2C2080b.f10550a;
        C2085g c2085g = componentCallbacks2C2080b.f10552c;
        Context applicationContext = c2085g.getApplicationContext();
        C2086h c2086h = c2085g.f10565h;
        Registry registry = new Registry();
        DefaultImageHeaderParser defaultImageHeaderParser = new DefaultImageHeaderParser();
        C5320k0 c5320k0 = registry.f10544g;
        synchronized (c5320k0) {
            c5320k0.f33593a.add(defaultImageHeaderParser);
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 27) {
            C0037p c0037p = new C0037p();
            C5320k0 c5320k1 = registry.f10544g;
            synchronized (c5320k1) {
                c5320k1.f33593a.add(c0037p);
            }
        }
        Resources resources = applicationContext.getResources();
        List<ImageHeaderParser> listM6230d = registry.m6230d();
        InterfaceC9451b interfaceC9451b = componentCallbacks2C2080b.f10553d;
        C5372a c5372a = new C5372a(applicationContext, listM6230d, interfaceC9452c, interfaceC9451b);
        VideoDecoder videoDecoder = new VideoDecoder(interfaceC9452c, new VideoDecoder.C2139g());
        C2140a c2140a = new C2140a(registry.m6230d(), resources.getDisplayMetrics(), interfaceC9452c, interfaceC9451b);
        if (i10 < 28 || !c2086h.f10568a.containsKey(C2082d.class)) {
            c0030i = new C0030i(c2140a, 0);
            c2142c = new C2142c(c2140a, interfaceC9451b);
        } else {
            c2142c = new C0040s();
            c0030i = new C0031j();
        }
        if (i10 >= 28) {
            registry.m6229c(new C1729a.c(new C1729a(listM6230d, interfaceC9451b)), InputStream.class, Drawable.class, "Animation");
            registry.m6229c(new C1729a.b(new C1729a(listM6230d, interfaceC9451b)), ByteBuffer.class, Drawable.class, "Animation");
        }
        C1733e c1733e = new C1733e(applicationContext);
        C0023b c0023b = new C0023b(interfaceC9451b);
        C5470a c5470a = new C5470a();
        C9203i c9203i = new C9203i(2);
        ContentResolver contentResolver = applicationContext.getContentResolver();
        C9203i c9203i2 = new C9203i(1);
        C5894a c5894a = registry.f10539b;
        synchronized (c5894a) {
            c5894a.f35222a.add(new C5894a.a(ByteBuffer.class, c9203i2));
        }
        C7967l0 c7967l0 = new C7967l0(interfaceC9451b);
        C5894a c5894a2 = registry.f10539b;
        synchronized (c5894a2) {
            c5894a2.f35222a.add(new C5894a.a(InputStream.class, c7967l0));
        }
        registry.m6229c(c0030i, ByteBuffer.class, Bitmap.class, "Bitmap");
        registry.m6229c(c2142c, InputStream.class, Bitmap.class, "Bitmap");
        String str = Build.FINGERPRINT;
        if (!"robolectric".equals(str)) {
            registry.m6229c(new C0030i(c2140a, 1), ParcelFileDescriptor.class, Bitmap.class, "Bitmap");
        }
        registry.m6229c(videoDecoder, ParcelFileDescriptor.class, Bitmap.class, "Bitmap");
        registry.m6229c(new VideoDecoder(interfaceC9452c, new VideoDecoder.C2135c()), AssetFileDescriptor.class, Bitmap.class, "Bitmap");
        C10098w.a<?> aVar = C10098w.a.f51215a;
        registry.m6227a(Bitmap.class, Bitmap.class, aVar);
        registry.m6229c(new C0044w(), Bitmap.class, Bitmap.class, "Bitmap");
        registry.m6228b(Bitmap.class, c0023b);
        registry.m6229c(new C0022a(resources, c0030i), ByteBuffer.class, BitmapDrawable.class, "BitmapDrawable");
        registry.m6229c(new C0022a(resources, c2142c), InputStream.class, BitmapDrawable.class, "BitmapDrawable");
        registry.m6229c(new C0022a(resources, videoDecoder), ParcelFileDescriptor.class, BitmapDrawable.class, "BitmapDrawable");
        registry.m6228b(BitmapDrawable.class, new C5298b1(interfaceC9452c, c0023b));
        registry.m6229c(new C5380i(listM6230d, c5372a, interfaceC9451b), InputStream.class, C5374c.class, "Animation");
        registry.m6229c(c5372a, ByteBuffer.class, C5374c.class, "Animation");
        registry.m6228b(C5374c.class, new C8573r0());
        registry.m6227a(InterfaceC8494a.class, InterfaceC8494a.class, aVar);
        registry.m6229c(new C5378g(interfaceC9452c), InterfaceC8494a.class, Bitmap.class, "Bitmap");
        registry.m6229c(c1733e, Uri.class, Drawable.class, "legacy_append");
        registry.m6229c(new C0041t(c1733e, interfaceC9452c), Uri.class, Bitmap.class, "legacy_append");
        registry.m6233g(new C1321a.a());
        registry.m6227a(File.class, ByteBuffer.class, new C10078c.b());
        registry.m6227a(File.class, InputStream.class, new C10081f.e());
        registry.m6229c(new C5047a(), File.class, File.class, "legacy_append");
        registry.m6227a(File.class, ParcelFileDescriptor.class, new C10081f.b());
        registry.m6227a(File.class, File.class, aVar);
        registry.m6233g(new C2104k.a(interfaceC9451b));
        if (!"robolectric".equals(str)) {
            registry.m6233g(new ParcelFileDescriptorRewinder.C2093a());
        }
        C10080e.c cVar = new C10080e.c(applicationContext);
        C10080e.a aVar2 = new C10080e.a(applicationContext);
        C10080e.b bVar = new C10080e.b(applicationContext);
        Class cls = Integer.TYPE;
        registry.m6227a(cls, InputStream.class, cVar);
        registry.m6227a(Integer.class, InputStream.class, cVar);
        registry.m6227a(cls, AssetFileDescriptor.class, aVar2);
        registry.m6227a(Integer.class, AssetFileDescriptor.class, aVar2);
        registry.m6227a(cls, Drawable.class, bVar);
        registry.m6227a(Integer.class, Drawable.class, bVar);
        registry.m6227a(Uri.class, InputStream.class, new C10096u.b(applicationContext));
        registry.m6227a(Uri.class, AssetFileDescriptor.class, new C10096u.a(applicationContext));
        C10095t.c cVar2 = new C10095t.c(resources);
        C10095t.a aVar3 = new C10095t.a(resources);
        C10095t.b bVar2 = new C10095t.b(resources);
        registry.m6227a(Integer.class, Uri.class, cVar2);
        registry.m6227a(cls, Uri.class, cVar2);
        registry.m6227a(Integer.class, AssetFileDescriptor.class, aVar3);
        registry.m6227a(cls, AssetFileDescriptor.class, aVar3);
        registry.m6227a(Integer.class, InputStream.class, bVar2);
        registry.m6227a(cls, InputStream.class, bVar2);
        registry.m6227a(String.class, InputStream.class, new C10079d.c());
        registry.m6227a(Uri.class, InputStream.class, new C10079d.c());
        registry.m6227a(String.class, InputStream.class, new C10097v.c());
        registry.m6227a(String.class, ParcelFileDescriptor.class, new C10097v.b());
        registry.m6227a(String.class, AssetFileDescriptor.class, new C10097v.a());
        registry.m6227a(Uri.class, InputStream.class, new C10076a.c(applicationContext.getAssets()));
        registry.m6227a(Uri.class, AssetFileDescriptor.class, new C10076a.b(applicationContext.getAssets()));
        registry.m6227a(Uri.class, InputStream.class, new C10293b.a(applicationContext));
        registry.m6227a(Uri.class, InputStream.class, new C10294c.a(applicationContext));
        if (i10 >= 29) {
            registry.m6227a(Uri.class, InputStream.class, new C10295d.c(applicationContext));
            registry.m6227a(Uri.class, ParcelFileDescriptor.class, new C10295d.b(applicationContext));
        }
        registry.m6227a(Uri.class, InputStream.class, new C10099x.d(contentResolver));
        registry.m6227a(Uri.class, ParcelFileDescriptor.class, new C10099x.b(contentResolver));
        registry.m6227a(Uri.class, AssetFileDescriptor.class, new C10099x.a(contentResolver));
        registry.m6227a(Uri.class, InputStream.class, new C10100y.a());
        registry.m6227a(URL.class, InputStream.class, new C10296e.a());
        registry.m6227a(Uri.class, File.class, new C10086k.a(applicationContext));
        registry.m6227a(C10082g.class, InputStream.class, new C10292a.a());
        registry.m6227a(byte[].class, ByteBuffer.class, new C10077b.a());
        registry.m6227a(byte[].class, InputStream.class, new C10077b.d());
        registry.m6227a(Uri.class, Uri.class, aVar);
        registry.m6227a(Drawable.class, Drawable.class, aVar);
        registry.m6229c(new C1734f(), Drawable.class, Drawable.class, "legacy_append");
        registry.m6234h(Bitmap.class, BitmapDrawable.class, new C1702c(resources));
        registry.m6234h(Bitmap.class, byte[].class, c5470a);
        registry.m6234h(Drawable.class, byte[].class, new C0020c(interfaceC9452c, c5470a, c9203i));
        registry.m6234h(C5374c.class, byte[].class, c9203i);
        VideoDecoder videoDecoder2 = new VideoDecoder(interfaceC9452c, new VideoDecoder.C2136d());
        registry.m6229c(videoDecoder2, ByteBuffer.class, Bitmap.class, "legacy_append");
        registry.m6229c(new C0022a(resources, videoDecoder2), ByteBuffer.class, BitmapDrawable.class, "legacy_append");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC5704c interfaceC5704c = (InterfaceC5704c) it.next();
            try {
                interfaceC5704c.m12071a();
            } catch (AbstractMethodError e10) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(interfaceC5704c.getClass().getName()), e10);
            }
        }
        return registry;
    }
}
