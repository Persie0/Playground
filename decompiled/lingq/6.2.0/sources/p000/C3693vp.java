package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.CustomTabActivity;
import com.facebook.CustomTabMainActivity;
import com.lingq.core.player.service.PlayerService;

/* JADX INFO: renamed from: vp */
/* JADX INFO: loaded from: classes2.dex */
public final class C3693vp extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f65736a;

    /* JADX INFO: renamed from: b */
    public final Object f65737b;

    public C3693vp(kjc kjcVar) {
        this.f65736a = 5;
        this.f65737b = kjcVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i = this.f65736a;
        Object obj = this.f65737b;
        switch (i) {
            case 0:
                ((AbstractC3284l3) obj).mo15765j();
                break;
            case 1:
                C3738wx c3738wx = (C3738wx) obj;
                if (!isInitialStickyBroadcast()) {
                    c3738wx.m24186b(C3627tx.m22332b(context, intent, c3738wx.f67464j, c3738wx.f67463i, c3738wx.m24185a()));
                }
                break;
            case 2:
                context.getClass();
                intent.getClass();
                ((CustomTabActivity) obj).finish();
                break;
            case 3:
                context.getClass();
                intent.getClass();
                CustomTabMainActivity customTabMainActivity = (CustomTabMainActivity) obj;
                Intent intent2 = new Intent(customTabMainActivity, (Class<?>) CustomTabMainActivity.class);
                int i2 = CustomTabMainActivity.f11347c;
                intent2.setAction("CustomTabMainActivity.action_refresh");
                intent2.putExtra("CustomTabMainActivity.extra_url", intent.getStringExtra("CustomTabMainActivity.extra_url"));
                intent2.addFlags(603979776);
                customTabMainActivity.startActivity(intent2);
                break;
            case 4:
                context.getClass();
                intent.getClass();
                if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                    ((PlayerService) obj).m8471c().m8447J();
                }
                break;
            default:
                kjc kjcVar = (kjc) obj;
                if (intent != null) {
                    String action = intent.getAction();
                    if (action != null) {
                        int iHashCode = action.hashCode();
                        if (iHashCode != -1928239649) {
                            if (iHashCode == 1279883384 && action.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
                                xcc xccVar = kjcVar.f47438f;
                                kjc.m15280l(xccVar);
                                xccVar.f68076I.m17923a("[sgtm] App Receiver notified batches are available");
                                tic ticVar = kjcVar.f47439g;
                                kjc.m15280l(ticVar);
                                ticVar.m22076M(new s3d(this, 6));
                            }
                            break;
                        } else if (action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
                            blb.m3870a();
                            if (kjcVar.f47436d.m4869O(null, z8c.f71132P0)) {
                                xcc xccVar2 = kjcVar.f47438f;
                                kjc.m15280l(xccVar2);
                                xccVar2.f68076I.m17923a("App receiver notified triggers are available");
                                tic ticVar2 = kjcVar.f47439g;
                                kjc.m15280l(ticVar2);
                                ticVar2.m22076M(new s3d(kjcVar, 7));
                                break;
                            }
                        }
                        xcc xccVar3 = kjcVar.f47438f;
                        kjc.m15280l(xccVar3);
                        xccVar3.f68083i.m17923a("App receiver called with unknown action");
                    } else {
                        xcc xccVar4 = kjcVar.f47438f;
                        kjc.m15280l(xccVar4);
                        xccVar4.f68083i.m17923a("App receiver called with null action");
                    }
                } else {
                    xcc xccVar5 = kjcVar.f47438f;
                    kjc.m15280l(xccVar5);
                    xccVar5.f68083i.m17923a("App receiver called with null intent");
                }
                break;
        }
    }

    public /* synthetic */ C3693vp(Object obj, int i) {
        this.f65736a = i;
        this.f65737b = obj;
    }
}
