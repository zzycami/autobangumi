package com.bravedefault.autobangumi.ui.torrent

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.tv.material3.Button
import androidx.tv.material3.ExperimentalTvMaterial3Api
import com.bravedefault.autobangumi.R

@OptIn(ExperimentalTvMaterial3Api::class)
@Composable
fun TorrentListItemView() {
    Row {
        Box(modifier = Modifier
            .width(5.dp)
            .fillMaxHeight()
            .background(Color.Transparent))
        
        Button(
            modifier = Modifier.width(40.dp).height(40.dp).padding(6.dp),
            onClick = { /*TODO*/ }
        ) {
            Image(
                painter = painterResource(id = R.drawable.pause_button_background),
                contentDescription = stringResource(id = R.string.pause_torrent),
                contentScale = ContentScale.Fit
            )
        }
    }
}