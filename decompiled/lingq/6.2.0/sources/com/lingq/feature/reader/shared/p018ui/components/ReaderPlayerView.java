package com.lingq.feature.reader.shared.p018ui.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.lingq.feature.reader.R$id;
import com.lingq.feature.reader.R$layout;
import com.lingq.feature.reader.old.ReaderFragment;
import com.lingq.feature.reader.shared.p018ui.components.ReaderPlayerView;
import p000.C3386nv;
import p000.ava;
import p000.hm5;
import p000.lfa;
import p000.wb7;
import p000.y52;

/* JADX INFO: loaded from: classes3.dex */
public final class ReaderPlayerView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final ava f30399a;

    /* JADX INFO: renamed from: b */
    public wb7 f30400b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderPlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        View viewInflate = LayoutInflater.from(context).inflate(R$layout.view_reader_player, (ViewGroup) this, false);
        addView(viewInflate);
        int i2 = R$id.btn_player_back;
        ImageView imageView = (ImageView) lfa.m16159c(viewInflate, i2);
        if (imageView != null) {
            i2 = R$id.btn_player_close;
            ImageView imageView2 = (ImageView) lfa.m16159c(viewInflate, i2);
            if (imageView2 != null) {
                i2 = R$id.btn_player_expand;
                ImageView imageView3 = (ImageView) lfa.m16159c(viewInflate, i2);
                if (imageView3 != null) {
                    i2 = R$id.btn_player_pause_play;
                    ImageView imageView4 = (ImageView) lfa.m16159c(viewInflate, i2);
                    if (imageView4 != null) {
                        i2 = R$id.view_controls;
                        if (((LinearLayout) lfa.m16159c(viewInflate, i2)) != null) {
                            this.f30399a = new ava(imageView, imageView2, imageView3, imageView4);
                            return;
                        }
                    }
                }
            }
        }
        C3386nv.m17635v("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        throw null;
    }

    public final ava getBinding() {
        return this.f30399a;
    }

    public final void setPlayerControlsListener(wb7 wb7Var) {
        wb7Var.getClass();
        this.f30400b = wb7Var;
    }

    public final void setupViews(hm5 hm5Var) {
        hm5Var.getClass();
        ava avaVar = this.f30399a;
        final int i = 0;
        avaVar.f7596d.setOnClickListener(new View.OnClickListener(this) { // from class: ky7

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ReaderPlayerView f48778b;

            {
                this.f48778b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                ReaderPlayerView readerPlayerView = this.f48778b;
                switch (i2) {
                    case 0:
                        wb7 wb7Var = readerPlayerView.f30400b;
                        if (wb7Var != null) {
                            ReaderFragment readerFragment = (ReaderFragment) ((web) wb7Var).f66742a;
                            bh4[] bh4VarArr = ReaderFragment.f28218P0;
                            readerFragment.m9290W0().m9328h3(ea7.f36943k);
                        }
                        break;
                    case 1:
                        wb7 wb7Var2 = readerPlayerView.f30400b;
                        if (wb7Var2 != null) {
                            ReaderFragment readerFragment2 = (ReaderFragment) ((web) wb7Var2).f66742a;
                            bh4[] bh4VarArr2 = ReaderFragment.f28218P0;
                            readerFragment2.m9290W0().m9328h3(ea7.f36936d);
                        }
                        break;
                    default:
                        wb7 wb7Var3 = readerPlayerView.f30400b;
                        if (wb7Var3 != null) {
                            ReaderFragment readerFragment3 = (ReaderFragment) ((web) wb7Var3).f66742a;
                            bh4[] bh4VarArr3 = ReaderFragment.f28218P0;
                            readerFragment3.m9290W0().m9328h3(ea7.f36937e);
                        }
                        break;
                }
            }
        });
        final int i2 = 1;
        avaVar.f7593a.setOnClickListener(new View.OnClickListener(this) { // from class: ky7

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ReaderPlayerView f48778b;

            {
                this.f48778b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                ReaderPlayerView readerPlayerView = this.f48778b;
                switch (i3) {
                    case 0:
                        wb7 wb7Var = readerPlayerView.f30400b;
                        if (wb7Var != null) {
                            ReaderFragment readerFragment = (ReaderFragment) ((web) wb7Var).f66742a;
                            bh4[] bh4VarArr = ReaderFragment.f28218P0;
                            readerFragment.m9290W0().m9328h3(ea7.f36943k);
                        }
                        break;
                    case 1:
                        wb7 wb7Var2 = readerPlayerView.f30400b;
                        if (wb7Var2 != null) {
                            ReaderFragment readerFragment2 = (ReaderFragment) ((web) wb7Var2).f66742a;
                            bh4[] bh4VarArr2 = ReaderFragment.f28218P0;
                            readerFragment2.m9290W0().m9328h3(ea7.f36936d);
                        }
                        break;
                    default:
                        wb7 wb7Var3 = readerPlayerView.f30400b;
                        if (wb7Var3 != null) {
                            ReaderFragment readerFragment3 = (ReaderFragment) ((web) wb7Var3).f66742a;
                            bh4[] bh4VarArr3 = ReaderFragment.f28218P0;
                            readerFragment3.m9290W0().m9328h3(ea7.f36937e);
                        }
                        break;
                }
            }
        });
        final int i3 = 2;
        avaVar.f7594b.setOnClickListener(new View.OnClickListener(this) { // from class: ky7

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ReaderPlayerView f48778b;

            {
                this.f48778b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i3;
                ReaderPlayerView readerPlayerView = this.f48778b;
                switch (i4) {
                    case 0:
                        wb7 wb7Var = readerPlayerView.f30400b;
                        if (wb7Var != null) {
                            ReaderFragment readerFragment = (ReaderFragment) ((web) wb7Var).f66742a;
                            bh4[] bh4VarArr = ReaderFragment.f28218P0;
                            readerFragment.m9290W0().m9328h3(ea7.f36943k);
                        }
                        break;
                    case 1:
                        wb7 wb7Var2 = readerPlayerView.f30400b;
                        if (wb7Var2 != null) {
                            ReaderFragment readerFragment2 = (ReaderFragment) ((web) wb7Var2).f66742a;
                            bh4[] bh4VarArr2 = ReaderFragment.f28218P0;
                            readerFragment2.m9290W0().m9328h3(ea7.f36936d);
                        }
                        break;
                    default:
                        wb7 wb7Var3 = readerPlayerView.f30400b;
                        if (wb7Var3 != null) {
                            ReaderFragment readerFragment3 = (ReaderFragment) ((web) wb7Var3).f66742a;
                            bh4[] bh4VarArr3 = ReaderFragment.f28218P0;
                            readerFragment3.m9290W0().m9328h3(ea7.f36937e);
                        }
                        break;
                }
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReaderPlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReaderPlayerView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ ReaderPlayerView(Context context, AttributeSet attributeSet, int i, int i2, y52 y52Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
