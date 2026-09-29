package p150h9;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.provider.Settings;
import com.google.android.exoplayer2.C2413j;
import com.google.android.exoplayer2.InterfaceC2536y;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.audio.C2374h;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.android.exoplayer2.mediacodec.C2425b;
import com.google.android.exoplayer2.metadata.C2431a;
import java.util.ArrayList;
import p195j9.C6428e;
import p219ka.C6652m;
import p479xa.C10134c0;
import p505ya.C10324f;
import za.C10466b;

/* JADX INFO: renamed from: h9.d */
/* JADX INFO: loaded from: classes.dex */
public final class C5907d implements InterfaceC5928n0 {

    /* JADX INFO: renamed from: a */
    public final Context f35273a;

    /* JADX INFO: renamed from: b */
    public final C2425b f35274b = new C2425b();

    public C5907d(Context context) {
        this.f35273a = context;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0084  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:9:0x0044  */
    @Override // p150h9.InterfaceC5928n0
    /* JADX INFO: renamed from: a */
    public final InterfaceC2536y[] mo12334a(Handler handler, C2413j.b bVar, C2413j.b bVar2, C2413j.b bVar3, C2413j.b bVar4) {
        boolean z10;
        C6428e c6428e;
        ArrayList arrayList = new ArrayList();
        C2425b c2425b = this.f35274b;
        Context context = this.f35273a;
        arrayList.add(new C10324f(context, c2425b, handler, bVar));
        DefaultAudioSink.C2360e c2360e = new DefaultAudioSink.C2360e();
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
        int i10 = C10134c0.f51354a;
        if (i10 >= 17) {
            String str = C10134c0.f51356c;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        if (z10 && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
            c6428e = C6428e.f36917d;
        } else if (i10 >= 29) {
            if (!C10134c0.m19024I(context)) {
                if (!(i10 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
                    if (intentRegisterReceiver != null) {
                        c6428e = C6428e.f36916c;
                    } else {
                        c6428e = C6428e.f36916c;
                    }
                }
            }
            c6428e = new C6428e(C6428e.a.m13054a(), 8);
        } else if (intentRegisterReceiver != null || intentRegisterReceiver.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) {
            c6428e = C6428e.f36916c;
        } else {
            c6428e = new C6428e(intentRegisterReceiver.getIntArrayExtra("android.media.extra.ENCODINGS"), intentRegisterReceiver.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
        }
        c6428e.getClass();
        c2360e.f11908a = c6428e;
        c2360e.f11910c = false;
        c2360e.f11911d = false;
        c2360e.f11912e = 0;
        if (c2360e.f11909b == null) {
            c2360e.f11909b = new DefaultAudioSink.C2362g(new AudioProcessor[0]);
        }
        arrayList.add(new C2374h(this.f35273a, this.f35274b, handler, bVar2, new DefaultAudioSink(c2360e)));
        arrayList.add(new C6652m(bVar3, handler.getLooper()));
        arrayList.add(new C2431a(bVar4, handler.getLooper()));
        arrayList.add(new C10466b());
        return (InterfaceC2536y[]) arrayList.toArray(new InterfaceC2536y[0]);
    }
}
